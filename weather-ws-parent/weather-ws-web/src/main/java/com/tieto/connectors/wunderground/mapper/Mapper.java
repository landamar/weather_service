package com.tieto.connectors.wunderground.mapper;

import java.time.Instant;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import com.tieto.connectors.wunderground.transportobjects.CurrentObservation;
import com.tieto.connectors.wunderground.transportobjects.WundergroundConditionTO;
import com.tieto.objects.domain.HumidityDO;
import com.tieto.objects.domain.ObservationDO;
import com.tieto.objects.domain.PlaceDO;
import com.tieto.objects.domain.PrecipitationDO;
import com.tieto.objects.domain.TemperatureDO;
import com.tieto.objects.domain.WeatherDO;
import com.tieto.objects.domain.WindDO;

@Component
@ApplicationScope
public class Mapper {

  public WeatherDO fromTOintoDO(WundergroundConditionTO weatherConditionTO) {
    final WeatherDO weatherDO = new WeatherDO.Builder()
        .observation(mapTO2ObservationDO(weatherConditionTO.getCurrentObservation()))
        .place(mapTO2PlaceDO(weatherConditionTO.getCurrentObservation()))
        .precipitation(mapTO2PrecipitationDO(weatherConditionTO.getCurrentObservation()))
        .humidity(mapTO2HumidityDO(weatherConditionTO.getCurrentObservation()))
        .temperature(mapTO2TemperatureDO(weatherConditionTO.getCurrentObservation()))
        .wind(mapTO2WindDO(weatherConditionTO.getCurrentObservation()))
        .build();

    return weatherDO;
  }

  private WindDO mapTO2WindDO(CurrentObservation currentObservation) {
    final WindDO windDO = new WindDO.Builder()
        .description(currentObservation.getWindString())
        .speedKmh(currentObservation.getWindKph())
        .direction(currentObservation.getWindDir())
        .build();

    return windDO;
  }

  private TemperatureDO mapTO2TemperatureDO(CurrentObservation currentObservation) {
    final TemperatureDO temperatureDO = new TemperatureDO.Builder()
        .celsiusValue(currentObservation.getTempC())
        .build();

    return temperatureDO;
  }

  private HumidityDO mapTO2HumidityDO(CurrentObservation currentObservation) {
    final HumidityDO humidityDO = new HumidityDO.Builder()
        .humValue(Float.parseFloat(currentObservation.getRelativeHumidity().replace("%", "")))
        .build();

    return humidityDO;
  }

  private PrecipitationDO mapTO2PrecipitationDO(CurrentObservation currentObservation) {
    final PrecipitationDO precipitationDO = new PrecipitationDO.Builder()
        .valueMmHod(parseString2Float(currentObservation.getPrecip1hrMetric()))
        .valueMmToday(parseString2Float(currentObservation.getPrecipTodayMetric()))
        .build();

    return precipitationDO;
  }

  private PlaceDO mapTO2PlaceDO(CurrentObservation currentObservation) {
    final PlaceDO placeDO = new PlaceDO.Builder()
        .city(currentObservation.getDisplayLocation().getCity())
        .country(currentObservation.getDisplayLocation().getCountryIso3166())
        .build();

    return placeDO;
  }

  private ObservationDO mapTO2ObservationDO(CurrentObservation currentObservation) {
    final ObservationDO observationDO = new ObservationDO.Builder()
        .place(currentObservation.getObservationLocation().getFull())
        .time(parseEpoch2Instant(currentObservation.getObservationEpoch()))
        .build();

    return observationDO;
  }

  private Instant parseEpoch2Instant(String epoch) {
    final Instant dateInstant = Instant.ofEpochMilli(Long.parseLong(epoch) * 1000);
    return dateInstant;
  }

  private Float parseString2Float(String stringValue) {
    if (stringValue == null) {
      return null;
    }
    if ("--".equals(stringValue)) {
      return 0.0f;
    }
    final Float floatValue;
    try {
      floatValue = Float.parseFloat(stringValue);

      return floatValue;
    } catch (final NumberFormatException e) {

      return null;
    }
  }

}
