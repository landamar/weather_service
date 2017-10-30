package com.tieto.rest;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tieto.exception.ForecastNotFoundException;
import com.tieto.objects.domain.ClientErrorInformation;
import com.tieto.objects.domain.WeatherDO;
import com.tieto.services.cache.PrognosisCache;

@RestController
public class Rest {

  @Autowired
  private PrognosisCache prognosisCache;

  @Autowired
  private RestMapper mapper;

  @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "text/plain")
  public String ping() {
    return "The weather service is alive!";
  }

  @RequestMapping(value = "/places", method = RequestMethod.GET, produces = "application/json")
  public Map<String, String> getListOfPLaces() throws ForecastNotFoundException {
    final Map<String, WeatherDO> cache = this.prognosisCache.getCache();
    if (cache.isEmpty()) {
      throw new ForecastNotFoundException("Forecasts was not found, please checke the log file");
    }
    final Map<String, String> places = this.mapper.mapForecastToPlaces(cache);
    return places;
  }

  @RequestMapping(value = "/weather", method = RequestMethod.GET, produces = "application/json")
  public Map<String, WeatherDO> getAllForecasts() throws ForecastNotFoundException {
    final Map<String, WeatherDO> cache = this.prognosisCache.getCache();
    if (cache.isEmpty()) {
      throw new ForecastNotFoundException("There are no places, please checke the log file");
    }
    return cache;
  }

  @RequestMapping(value = "/weather/{city}", method = RequestMethod.GET, produces = "application/json")
  public WeatherDO getCurentCityForecast(@PathVariable String city) throws ForecastNotFoundException {
    final WeatherDO weatherDO = this.prognosisCache.getCache().get(city);
    if (weatherDO == null) {
      throw new ForecastNotFoundException("The city was not found, please check the log file");
    }
    return weatherDO;
  }

  @ExceptionHandler(ForecastNotFoundException.class)
  public ResponseEntity<ClientErrorInformation> rulesForForecastNotFound(HttpServletRequest req, Exception e) {
    final ClientErrorInformation error = new ClientErrorInformation(e.toString(), req.getRequestURI());
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

}
