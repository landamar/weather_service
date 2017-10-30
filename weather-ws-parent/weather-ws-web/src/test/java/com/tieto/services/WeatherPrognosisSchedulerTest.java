package com.tieto.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.URL;
import java.time.Instant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tieto.connectors.exception.ConnectorException;
import com.tieto.connectors.wunderground.client.WeatherPrognosisWunderground;
import com.tieto.connectors.wunderground.mapper.Mapper;
import com.tieto.connectors.wunderground.transportobjects.CurrentObservation;
import com.tieto.connectors.wunderground.transportobjects.DisplayLocation;
import com.tieto.connectors.wunderground.transportobjects.ObservationLocation;
import com.tieto.connectors.wunderground.transportobjects.Response;
import com.tieto.connectors.wunderground.transportobjects.WundergroundConditionTO;
import com.tieto.objects.domain.HumidityDO;
import com.tieto.objects.domain.ObservationDO;
import com.tieto.objects.domain.PlaceDO;
import com.tieto.objects.domain.PrecipitationDO;
import com.tieto.objects.domain.TemperatureDO;
import com.tieto.objects.domain.WeatherDO;
import com.tieto.objects.domain.WindDO;

@RunWith(MockitoJUnitRunner.class)
public class WeatherPrognosisSchedulerTest {

  public static WundergroundConditionTO WUNDERGROUND_TO;
  static {
    WUNDERGROUND_TO = new WundergroundConditionTO();
    WUNDERGROUND_TO.setCurrentObservation(new CurrentObservation());
    WUNDERGROUND_TO.setResponse(new Response());
    WUNDERGROUND_TO.getCurrentObservation().setObservationLocation(new ObservationLocation());
    WUNDERGROUND_TO.getCurrentObservation().setDisplayLocation(new DisplayLocation());
    WUNDERGROUND_TO.getCurrentObservation().setRelativeHumidity("62%");
    WUNDERGROUND_TO.getCurrentObservation().getObservationLocation().setFull("Ostrava, ");
    WUNDERGROUND_TO.getCurrentObservation().getDisplayLocation().setCountryIso3166("CZ");
    WUNDERGROUND_TO.getCurrentObservation().getDisplayLocation().setCity("Ostrava");
    WUNDERGROUND_TO.getCurrentObservation().setPrecip1hrMetric("0");
    WUNDERGROUND_TO.getCurrentObservation().setPrecipTodayMetric("0");
    WUNDERGROUND_TO.getCurrentObservation().setTempC(11.0f);
    WUNDERGROUND_TO.getCurrentObservation().setWindDir("0");
    WUNDERGROUND_TO.getCurrentObservation().setWindString("From the South at 6 MPH");
    WUNDERGROUND_TO.getCurrentObservation().setWindKph(9);
    WUNDERGROUND_TO.getCurrentObservation().setWindDir("NNW");
    WUNDERGROUND_TO.getCurrentObservation().setObservationEpoch("1340843233");

    ;
  }

  public static WeatherDO WEATHER_CONDITION_DO;
  static {
    final HumidityDO humidity = new HumidityDO.Builder()
        .humValue(62.0f)
        .build();
    final ObservationDO observation = new ObservationDO.Builder()
        .place("Ostrava, ")
        .time(Instant.ofEpochMilli(1340843233000L))
        .build();
    final PlaceDO place = new PlaceDO.Builder()
        .country("CZ")
        .city("Ostrava")
        .build();
    final PrecipitationDO precipitation = new PrecipitationDO.Builder()
        .valueMmHod(0.0f)
        .valueMmToday(0.0f)
        .build();
    final TemperatureDO temperature = new TemperatureDO.Builder()
        .celsiusValue(11f)
        .build();
    final WindDO wind = new WindDO.Builder()
        .description("From the South at 6 MPH")
        .direction("NNW")
        .speedKmh(9.0f)
        .build();
    WEATHER_CONDITION_DO = new WeatherDO.Builder()
        .humidity(humidity)
        .observation(observation)
        .place(place)
        .precipitation(precipitation)
        .temperature(temperature)
        .wind(wind)
        .build();
  }

  @InjectMocks
  WeatherPrognosisWunderground connectorClient;

  @Mock
  private ObjectMapper objectMapper;

  @Spy
  private Mapper mapper;

  @Test
  public void getCurentPrognosisProperlyJson()
      throws ConnectorException, JsonParseException, JsonMappingException, IOException {
    when(this.objectMapper.readValue(any(URL.class), eq(WundergroundConditionTO.class)))
        .thenReturn(WUNDERGROUND_TO);
    final WeatherDO curentPrognosis = this.connectorClient.getCurentPrognosis("CZ", "Ostrava");
    assertEquals(WEATHER_CONDITION_DO.getHumidity(), curentPrognosis.getHumidity());
    assertEquals(WEATHER_CONDITION_DO.getObservation(), curentPrognosis.getObservation());
    assertEquals(WEATHER_CONDITION_DO.getPlace(), curentPrognosis.getPlace());
    assertEquals(WEATHER_CONDITION_DO.getPrecipitation(), curentPrognosis.getPrecipitation());
    assertEquals(WEATHER_CONDITION_DO.getTemperature(), curentPrognosis.getTemperature());
  }

  @SuppressWarnings("unchecked")
  @Test(expected = ConnectorException.class)
  public void getCurentPrognosis() throws ConnectorException, JsonParseException, JsonMappingException, IOException {
    when(this.objectMapper.readValue(any(URL.class), eq(WundergroundConditionTO.class))).thenThrow(IOException.class);
    this.connectorClient.getCurentPrognosis("CZ", "Ostrava");
  }

  @Test(expected = ConnectorException.class)
  public void getCurentPrognosisInputNullParam()
      throws ConnectorException, JsonParseException, JsonMappingException, IOException {
    this.connectorClient.getCurentPrognosis(null, "Ostrava");
  }

  @Test(expected = ConnectorException.class)
  public void getCurentPrognosisInputEmptyParam()
      throws ConnectorException, JsonParseException, JsonMappingException, IOException {
    this.connectorClient.getCurentPrognosis("", "Ostrava");
  }

}
