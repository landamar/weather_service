package com.tieto.connectors;

import com.tieto.connectors.exception.ConnectorException;
import com.tieto.objects.domain.WeatherDO;

public interface WeatherPrognosisConnector {

  WeatherDO getCurentPrognosis(String country, String city) throws ConnectorException;

}
