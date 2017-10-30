package com.tieto.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import com.tieto.objects.domain.WeatherDO;

@Component
@ApplicationScope
public class RestMapper {
  public Map<String, String> mapForecastToPlaces(Map<String, WeatherDO> cache) {
    final Map<String, String> places = new HashMap<>();
    cache.values().forEach(v -> places.put(v.getPlace().getCountry(), v.getPlace().getCity()));
    return places;
  }
}
