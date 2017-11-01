package com.tieto.connectors.wunderground.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tieto.connectors.WeatherPrognosisConnector;
import com.tieto.connectors.exception.ConnectorException;
import com.tieto.connectors.wunderground.mapper.Mapper;
import com.tieto.connectors.wunderground.transportobjects.WundergroundConditionTO;
import com.tieto.objects.domain.WeatherDO;

@Component
@ApplicationScope
public class WeatherPrognosisWunderground implements WeatherPrognosisConnector {
  private static final Logger LOG = LogManager.getLogger(WeatherPrognosisWunderground.class);
  private static final String JSON_FORMAT = ".json";
  private static final String URL_WUNDERGROUND = "http://api.wunderground.com/api/<yourWunderGroundApiKey>/conditions/q/";
  private static final String INVALID_COUNTRY_PARAMETERS = "Country must not be null or empty";
  private static final String INVALID_CITY_PARAMETERS = "City must not be null or empty";

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private Mapper mapper;

  @Override
  public WeatherDO getCurentPrognosis(String country, String city) throws ConnectorException {
    final WundergroundConditionTO wunderConditionTO = getWeatherConditionFromUrl(country, city);
    final WeatherDO weatherCondition = this.mapper.fromTOintoDO(wunderConditionTO);
    return weatherCondition;
  }

  private WundergroundConditionTO getWeatherConditionFromUrl(String country, String city) throws ConnectorException {
    if (country == null || country.trim().isEmpty()) {
      throw fail(INVALID_COUNTRY_PARAMETERS);
    }
    if (city == null || city.trim().isEmpty()) {
      throw fail(INVALID_CITY_PARAMETERS);
    }
    final URL url = buildUrl(country, city);
    final String logText = "Get weather condition for Url: " + url;
    LOG.info(logText);
    try {
      final WundergroundConditionTO wunderConditionTO = this.objectMapper.readValue(url, WundergroundConditionTO.class);
      return wunderConditionTO;
    } catch (final IOException e) {
      throw fail(logText, e);
    }
  }

  private URL buildUrl(String inputCountry, String inputCity) throws ConnectorException {
    if (inputCountry == null || inputCountry.trim().isEmpty()) {
      throw fail(INVALID_COUNTRY_PARAMETERS);
    }
    if (inputCity == null || inputCity.trim().isEmpty()) {
      throw fail(INVALID_CITY_PARAMETERS);
    }
    final String logText = "Build the url request country: " + inputCountry + ", city: " + inputCity;
    LOG.info(logText);
    final StringBuilder url = new StringBuilder()
        .append(URL_WUNDERGROUND)
        .append(inputCountry)
        .append("/")
        .append(inputCity)
        .append(JSON_FORMAT);
    try {
      return new URL(url.toString());
    } catch (final MalformedURLException e) {
      throw fail(logText, e);
    }
  }

  private ConnectorException fail(String logText, Throwable cause) throws ConnectorException {
    LOG.error(logText + " FAILED, cause");
    return new ConnectorException("FAILED: " + logText, cause);
  }

  private ConnectorException fail(String logText) throws ConnectorException {
    LOG.error(logText);
    return new ConnectorException("FAILED: " + logText);
  }
}
