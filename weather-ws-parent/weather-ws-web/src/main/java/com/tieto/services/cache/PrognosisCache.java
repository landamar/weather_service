package com.tieto.services.cache;

import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tieto.objects.domain.WeatherDO;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrognosisCache {

  private Map<String, WeatherDO> forecastCache;

  @PostConstruct
  private void postConstruct() {
    this.forecastCache = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
  }

  public void addData2Cache(String key, WeatherDO prognosis) {
    this.forecastCache.put(key, prognosis);
  }

  public Map<String, WeatherDO> getCache() {
    return this.forecastCache;
  }
}
