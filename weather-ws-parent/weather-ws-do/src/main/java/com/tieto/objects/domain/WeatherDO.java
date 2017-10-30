package com.tieto.objects.domain;

import java.time.Duration;
import java.time.Instant;

public class WeatherDO {
  private final ObservationDO observation;
  private final PlaceDO place;
  private final PrecipitationDO precipitation;
  private final WindDO wind;
  private final HumidityDO humidity;
  private final TemperatureDO temperature;
  private final TimeStamp timeStamp;

  public WeatherDO(Builder builder) {
    this.observation = builder.observation;
    this.place = builder.place;
    this.precipitation = builder.precipitation;
    this.wind = builder.wind;
    this.humidity = builder.humidity;
    this.temperature = builder.temperature;
    this.timeStamp = new TimeStamp(Instant.now());
  }

  public PlaceDO getPlace() {
    return this.place;
  }

  public ObservationDO getObservation() {
    return this.observation;
  }

  public PrecipitationDO getPrecipitation() {
    return this.precipitation;
  }

  public WindDO getWind() {
    return this.wind;
  }

  public HumidityDO getHumidity() {
    return this.humidity;
  }

  public TemperatureDO getTemperature() {
    return this.temperature;
  }

  public TimeStamp getTimeStamp() {
    return this.timeStamp;
  }

  public boolean isOlderThan(Duration maxAge) {
    if (maxAge == null) {
      throw new IllegalArgumentException("Duration must not be null");
    }

    final Instant curentTimeStamp = Instant.ofEpochMilli(this.timeStamp.getEpochTime());
    final Instant currentTime = Instant.now();
    final Duration age = Duration.between(curentTimeStamp, currentTime);
    return age.compareTo(maxAge) > 0;
  }

  public static class Builder {

    private ObservationDO observation;
    private PlaceDO place;
    private PrecipitationDO precipitation;
    private WindDO wind;
    private HumidityDO humidity;
    private TemperatureDO temperature;

    public Builder observation(ObservationDO observation) {
      this.observation = observation;
      return this;
    }

    public Builder place(PlaceDO place) {
      this.place = place;
      return this;
    }

    public Builder precipitation(PrecipitationDO precipitation) {
      this.precipitation = precipitation;
      return this;
    }

    public Builder wind(WindDO wind) {
      this.wind = wind;
      return this;
    }

    public Builder humidity(HumidityDO humidity) {
      this.humidity = humidity;
      return this;
    }

    public Builder temperature(TemperatureDO temperature) {
      this.temperature = temperature;
      return this;
    }

    public WeatherDO build() {
      return new WeatherDO(this);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.humidity == null) ? 0 : this.humidity.hashCode());
    result = prime * result + ((this.observation == null) ? 0 : this.observation.hashCode());
    result = prime * result + ((this.place == null) ? 0 : this.place.hashCode());
    result = prime * result + ((this.precipitation == null) ? 0 : this.precipitation.hashCode());
    result = prime * result + ((this.temperature == null) ? 0 : this.temperature.hashCode());
    result = prime * result + ((this.timeStamp == null) ? 0 : this.timeStamp.hashCode());
    result = prime * result + ((this.wind == null) ? 0 : this.wind.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final WeatherDO other = (WeatherDO) obj;
    if (this.humidity == null) {
      if (other.humidity != null) {
        return false;
      }
    } else if (!this.humidity.equals(other.humidity)) {
      return false;
    }
    if (this.observation == null) {
      if (other.observation != null) {
        return false;
      }
    } else if (!this.observation.equals(other.observation)) {
      return false;
    }
    if (this.place == null) {
      if (other.place != null) {
        return false;
      }
    } else if (!this.place.equals(other.place)) {
      return false;
    }
    if (this.precipitation == null) {
      if (other.precipitation != null) {
        return false;
      }
    } else if (!this.precipitation.equals(other.precipitation)) {
      return false;
    }
    if (this.temperature == null) {
      if (other.temperature != null) {
        return false;
      }
    } else if (!this.temperature.equals(other.temperature)) {
      return false;
    }
    if (this.timeStamp == null) {
      if (other.timeStamp != null) {
        return false;
      }
    } else if (!this.timeStamp.equals(other.timeStamp)) {
      return false;
    }
    if (this.wind == null) {
      if (other.wind != null) {
        return false;
      }
    } else if (!this.wind.equals(other.wind)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format(
        "WeatherDO [observation=%s, place=%s, precipitation=%s, wind=%s, humidity=%s, temperature=%s, timeStamp=%s]",
        this.observation, this.place, this.precipitation, this.wind, this.humidity, this.temperature, this.timeStamp);
  }

}
