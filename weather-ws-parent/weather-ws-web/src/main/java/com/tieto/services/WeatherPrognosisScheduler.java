package com.tieto.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tieto.config.properties.LocationsLoader;
import com.tieto.connectors.WeatherPrognosisConnector;
import com.tieto.connectors.exception.ConnectorException;
import com.tieto.objects.domain.WeatherDO;
import com.tieto.services.cache.PrognosisCache;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
@EnableScheduling
public class WeatherPrognosisScheduler {

  private static final Logger LOG = LogManager.getLogger(WeatherPrognosisScheduler.class);

  @Autowired
  private PrognosisCache weatherConditions;

  @Autowired
  private WeatherPrognosisConnector wundergoundService;

  @Autowired
  private LocationsLoader locationLoader;

  @Scheduled(fixedDelay = 1800000)
  public void loadDataIntoCache() {
    LOG.info("Load data from wunderground into cache");
    this.weatherConditions.getCache().clear();
    this.locationLoader.getLocations().forEach(p -> {
      try {
        final WeatherDO weatherForCity = this.wundergoundService.getCurentPrognosis(p.getCountry(), p.getCity());
        this.weatherConditions.addData2Cache(p.getCity(), weatherForCity);
      } catch (final ConnectorException e) {
        LOG.error("Error loading data from wunderground", e);
      }
    });
  }
}
