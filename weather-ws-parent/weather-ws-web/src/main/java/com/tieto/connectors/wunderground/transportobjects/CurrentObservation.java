
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "image",
    "display_location",
    "observation_location",
    "estimated",
    "station_id",
    "observation_time",
    "observation_time_rfc822",
    "observation_epoch",
    "local_time_rfc822",
    "local_epoch",
    "local_tz_short",
    "local_tz_long",
    "local_tz_offset",
    "weather",
    "temperature_string",
    "temp_f",
    "temp_c",
    "relative_humidity",
    "wind_string",
    "wind_dir",
    "wind_degrees",
    "wind_mph",
    "wind_gust_mph",
    "wind_kph",
    "wind_gust_kph",
    "pressure_mb",
    "pressure_in",
    "pressure_trend",
    "dewpoint_string",
    "dewpoint_f",
    "dewpoint_c",
    "heat_index_string",
    "heat_index_f",
    "heat_index_c",
    "windchill_string",
    "windchill_f",
    "windchill_c",
    "feelslike_string",
    "feelslike_f",
    "feelslike_c",
    "visibility_mi",
    "visibility_km",
    "solarradiation",
    "UV",
    "precip_1hr_string",
    "precip_1hr_in",
    "precip_1hr_metric",
    "precip_today_string",
    "precip_today_in",
    "precip_today_metric",
    "icon",
    "icon_url",
    "forecast_url",
    "history_url",
    "ob_url",
    "nowcast"
})
public class CurrentObservation implements Serializable {

  @JsonProperty("image")
  private Image image;
  @JsonProperty("display_location")
  private DisplayLocation displayLocation;
  @JsonProperty("observation_location")
  private ObservationLocation observationLocation;
  @JsonProperty("estimated")
  private Estimated estimated;
  @JsonProperty("station_id")
  private String stationId;
  @JsonProperty("observation_time")
  private String observationTime;
  @JsonProperty("observation_time_rfc822")
  private String observationTimeRfc822;
  @JsonProperty("observation_epoch")
  private String observationEpoch;
  @JsonProperty("local_time_rfc822")
  private String localTimeRfc822;
  @JsonProperty("local_epoch")
  private String localEpoch;
  @JsonProperty("local_tz_short")
  private String localTzShort;
  @JsonProperty("local_tz_long")
  private String localTzLong;
  @JsonProperty("local_tz_offset")
  private String localTzOffset;
  @JsonProperty("weather")
  private String weather;
  @JsonProperty("temperature_string")
  private String temperatureString;
  @JsonProperty("temp_f")
  private float tempF;
  @JsonProperty("temp_c")
  private float tempC;
  @JsonProperty("relative_humidity")
  private String relativeHumidity;
  @JsonProperty("wind_string")
  private String windString;
  @JsonProperty("wind_dir")
  private String windDir;
  @JsonProperty("wind_degrees")
  private int windDegrees;
  @JsonProperty("wind_mph")
  private float windMph;
  @JsonProperty("wind_gust_mph")
  private String windGustMph;
  @JsonProperty("wind_kph")
  private int windKph;
  @JsonProperty("wind_gust_kph")
  private String windGustKph;
  @JsonProperty("pressure_mb")
  private String pressureMb;
  @JsonProperty("pressure_in")
  private String pressureIn;
  @JsonProperty("pressure_trend")
  private String pressureTrend;
  @JsonProperty("dewpoint_string")
  private String dewpointString;
  @JsonProperty("dewpoint_f")
  private int dewpointF;
  @JsonProperty("dewpoint_c")
  private int dewpointC;
  @JsonProperty("heat_index_string")
  private String heatIndexString;
  @JsonProperty("heat_index_f")
  private String heatIndexF;
  @JsonProperty("heat_index_c")
  private String heatIndexC;
  @JsonProperty("windchill_string")
  private String windchillString;
  @JsonProperty("windchill_f")
  private String windchillF;
  @JsonProperty("windchill_c")
  private String windchillC;
  @JsonProperty("feelslike_string")
  private String feelslikeString;
  @JsonProperty("feelslike_f")
  private String feelslikeF;
  @JsonProperty("feelslike_c")
  private String feelslikeC;
  @JsonProperty("visibility_mi")
  private String visibilityMi;
  @JsonProperty("visibility_km")
  private String visibilityKm;
  @JsonProperty("solarradiation")
  private String solarradiation;
  @JsonProperty("UV")
  private String uV;
  @JsonProperty("precip_1hr_string")
  private String precip1hrString;
  @JsonProperty("precip_1hr_in")
  private String precip1hrIn;
  @JsonProperty("precip_1hr_metric")
  private String precip1hrMetric;
  @JsonProperty("precip_today_string")
  private String precipTodayString;
  @JsonProperty("precip_today_in")
  private String precipTodayIn;
  @JsonProperty("precip_today_metric")
  private String precipTodayMetric;
  @JsonProperty("icon")
  private String icon;
  @JsonProperty("icon_url")
  private String iconUrl;
  @JsonProperty("forecast_url")
  private String forecastUrl;
  @JsonProperty("history_url")
  private String historyUrl;
  @JsonProperty("ob_url")
  private String obUrl;
  @JsonProperty("nowcast")
  private String nowcast;
  private final static long serialVersionUID = 3799108751352519715L;

  @JsonProperty("image")
  public Image getImage() {
    return this.image;
  }

  @JsonProperty("image")
  public void setImage(Image image) {
    this.image = image;
  }

  @JsonProperty("display_location")
  public DisplayLocation getDisplayLocation() {
    return this.displayLocation;
  }

  @JsonProperty("display_location")
  public void setDisplayLocation(DisplayLocation displayLocation) {
    this.displayLocation = displayLocation;
  }

  @JsonProperty("observation_location")
  public ObservationLocation getObservationLocation() {
    return this.observationLocation;
  }

  @JsonProperty("observation_location")
  public void setObservationLocation(ObservationLocation observationLocation) {
    this.observationLocation = observationLocation;
  }

  @JsonProperty("estimated")
  public Estimated getEstimated() {
    return this.estimated;
  }

  @JsonProperty("estimated")
  public void setEstimated(Estimated estimated) {
    this.estimated = estimated;
  }

  @JsonProperty("station_id")
  public String getStationId() {
    return this.stationId;
  }

  @JsonProperty("station_id")
  public void setStationId(String stationId) {
    this.stationId = stationId;
  }

  @JsonProperty("observation_time")
  public String getObservationTime() {
    return this.observationTime;
  }

  @JsonProperty("observation_time")
  public void setObservationTime(String observationTime) {
    this.observationTime = observationTime;
  }

  @JsonProperty("observation_time_rfc822")
  public String getObservationTimeRfc822() {
    return this.observationTimeRfc822;
  }

  @JsonProperty("observation_time_rfc822")
  public void setObservationTimeRfc822(String observationTimeRfc822) {
    this.observationTimeRfc822 = observationTimeRfc822;
  }

  @JsonProperty("observation_epoch")
  public String getObservationEpoch() {
    return this.observationEpoch;
  }

  @JsonProperty("observation_epoch")
  public void setObservationEpoch(String observationEpoch) {
    this.observationEpoch = observationEpoch;
  }

  @JsonProperty("local_time_rfc822")
  public String getLocalTimeRfc822() {
    return this.localTimeRfc822;
  }

  @JsonProperty("local_time_rfc822")
  public void setLocalTimeRfc822(String localTimeRfc822) {
    this.localTimeRfc822 = localTimeRfc822;
  }

  @JsonProperty("local_epoch")
  public String getLocalEpoch() {
    return this.localEpoch;
  }

  @JsonProperty("local_epoch")
  public void setLocalEpoch(String localEpoch) {
    this.localEpoch = localEpoch;
  }

  @JsonProperty("local_tz_short")
  public String getLocalTzShort() {
    return this.localTzShort;
  }

  @JsonProperty("local_tz_short")
  public void setLocalTzShort(String localTzShort) {
    this.localTzShort = localTzShort;
  }

  @JsonProperty("local_tz_long")
  public String getLocalTzLong() {
    return this.localTzLong;
  }

  @JsonProperty("local_tz_long")
  public void setLocalTzLong(String localTzLong) {
    this.localTzLong = localTzLong;
  }

  @JsonProperty("local_tz_offset")
  public String getLocalTzOffset() {
    return this.localTzOffset;
  }

  @JsonProperty("local_tz_offset")
  public void setLocalTzOffset(String localTzOffset) {
    this.localTzOffset = localTzOffset;
  }

  @JsonProperty("weather")
  public String getWeather() {
    return this.weather;
  }

  @JsonProperty("weather")
  public void setWeather(String weather) {
    this.weather = weather;
  }

  @JsonProperty("temperature_string")
  public String getTemperatureString() {
    return this.temperatureString;
  }

  @JsonProperty("temperature_string")
  public void setTemperatureString(String temperatureString) {
    this.temperatureString = temperatureString;
  }

  @JsonProperty("temp_f")
  public float getTempF() {
    return this.tempF;
  }

  @JsonProperty("temp_f")
  public void setTempF(float tempF) {
    this.tempF = tempF;
  }

  @JsonProperty("temp_c")
  public float getTempC() {
    return this.tempC;
  }

  @JsonProperty("temp_c")
  public void setTempC(float tempC) {
    this.tempC = tempC;
  }

  @JsonProperty("relative_humidity")
  public String getRelativeHumidity() {
    return this.relativeHumidity;
  }

  @JsonProperty("relative_humidity")
  public void setRelativeHumidity(String relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
  }

  @JsonProperty("wind_string")
  public String getWindString() {
    return this.windString;
  }

  @JsonProperty("wind_string")
  public void setWindString(String windString) {
    this.windString = windString;
  }

  @JsonProperty("wind_dir")
  public String getWindDir() {
    return this.windDir;
  }

  @JsonProperty("wind_dir")
  public void setWindDir(String windDir) {
    this.windDir = windDir;
  }

  @JsonProperty("wind_degrees")
  public int getWindDegrees() {
    return this.windDegrees;
  }

  @JsonProperty("wind_degrees")
  public void setWindDegrees(int windDegrees) {
    this.windDegrees = windDegrees;
  }

  @JsonProperty("wind_mph")
  public float getWindMph() {
    return this.windMph;
  }

  @JsonProperty("wind_mph")
  public void setWindMph(float windMph) {
    this.windMph = windMph;
  }

  @JsonProperty("wind_gust_mph")
  public String getWindGustMph() {
    return this.windGustMph;
  }

  @JsonProperty("wind_gust_mph")
  public void setWindGustMph(String windGustMph) {
    this.windGustMph = windGustMph;
  }

  @JsonProperty("wind_kph")
  public int getWindKph() {
    return this.windKph;
  }

  @JsonProperty("wind_kph")
  public void setWindKph(int windKph) {
    this.windKph = windKph;
  }

  @JsonProperty("wind_gust_kph")
  public String getWindGustKph() {
    return this.windGustKph;
  }

  @JsonProperty("wind_gust_kph")
  public void setWindGustKph(String windGustKph) {
    this.windGustKph = windGustKph;
  }

  @JsonProperty("pressure_mb")
  public String getPressureMb() {
    return this.pressureMb;
  }

  @JsonProperty("pressure_mb")
  public void setPressureMb(String pressureMb) {
    this.pressureMb = pressureMb;
  }

  @JsonProperty("pressure_in")
  public String getPressureIn() {
    return this.pressureIn;
  }

  @JsonProperty("pressure_in")
  public void setPressureIn(String pressureIn) {
    this.pressureIn = pressureIn;
  }

  @JsonProperty("pressure_trend")
  public String getPressureTrend() {
    return this.pressureTrend;
  }

  @JsonProperty("pressure_trend")
  public void setPressureTrend(String pressureTrend) {
    this.pressureTrend = pressureTrend;
  }

  @JsonProperty("dewpoint_string")
  public String getDewpointString() {
    return this.dewpointString;
  }

  @JsonProperty("dewpoint_string")
  public void setDewpointString(String dewpointString) {
    this.dewpointString = dewpointString;
  }

  @JsonProperty("dewpoint_f")
  public int getDewpointF() {
    return this.dewpointF;
  }

  @JsonProperty("dewpoint_f")
  public void setDewpointF(int dewpointF) {
    this.dewpointF = dewpointF;
  }

  @JsonProperty("dewpoint_c")
  public int getDewpointC() {
    return this.dewpointC;
  }

  @JsonProperty("dewpoint_c")
  public void setDewpointC(int dewpointC) {
    this.dewpointC = dewpointC;
  }

  @JsonProperty("heat_index_string")
  public String getHeatIndexString() {
    return this.heatIndexString;
  }

  @JsonProperty("heat_index_string")
  public void setHeatIndexString(String heatIndexString) {
    this.heatIndexString = heatIndexString;
  }

  @JsonProperty("heat_index_f")
  public String getHeatIndexF() {
    return this.heatIndexF;
  }

  @JsonProperty("heat_index_f")
  public void setHeatIndexF(String heatIndexF) {
    this.heatIndexF = heatIndexF;
  }

  @JsonProperty("heat_index_c")
  public String getHeatIndexC() {
    return this.heatIndexC;
  }

  @JsonProperty("heat_index_c")
  public void setHeatIndexC(String heatIndexC) {
    this.heatIndexC = heatIndexC;
  }

  @JsonProperty("windchill_string")
  public String getWindchillString() {
    return this.windchillString;
  }

  @JsonProperty("windchill_string")
  public void setWindchillString(String windchillString) {
    this.windchillString = windchillString;
  }

  @JsonProperty("windchill_f")
  public String getWindchillF() {
    return this.windchillF;
  }

  @JsonProperty("windchill_f")
  public void setWindchillF(String windchillF) {
    this.windchillF = windchillF;
  }

  @JsonProperty("windchill_c")
  public String getWindchillC() {
    return this.windchillC;
  }

  @JsonProperty("windchill_c")
  public void setWindchillC(String windchillC) {
    this.windchillC = windchillC;
  }

  @JsonProperty("feelslike_string")
  public String getFeelslikeString() {
    return this.feelslikeString;
  }

  @JsonProperty("feelslike_string")
  public void setFeelslikeString(String feelslikeString) {
    this.feelslikeString = feelslikeString;
  }

  @JsonProperty("feelslike_f")
  public String getFeelslikeF() {
    return this.feelslikeF;
  }

  @JsonProperty("feelslike_f")
  public void setFeelslikeF(String feelslikeF) {
    this.feelslikeF = feelslikeF;
  }

  @JsonProperty("feelslike_c")
  public String getFeelslikeC() {
    return this.feelslikeC;
  }

  @JsonProperty("feelslike_c")
  public void setFeelslikeC(String feelslikeC) {
    this.feelslikeC = feelslikeC;
  }

  @JsonProperty("visibility_mi")
  public String getVisibilityMi() {
    return this.visibilityMi;
  }

  @JsonProperty("visibility_mi")
  public void setVisibilityMi(String visibilityMi) {
    this.visibilityMi = visibilityMi;
  }

  @JsonProperty("visibility_km")
  public String getVisibilityKm() {
    return this.visibilityKm;
  }

  @JsonProperty("visibility_km")
  public void setVisibilityKm(String visibilityKm) {
    this.visibilityKm = visibilityKm;
  }

  @JsonProperty("solarradiation")
  public String getSolarradiation() {
    return this.solarradiation;
  }

  @JsonProperty("solarradiation")
  public void setSolarradiation(String solarradiation) {
    this.solarradiation = solarradiation;
  }

  @JsonProperty("UV")
  public String getUV() {
    return this.uV;
  }

  @JsonProperty("UV")
  public void setUV(String uV) {
    this.uV = uV;
  }

  @JsonProperty("precip_1hr_string")
  public String getPrecip1hrString() {
    return this.precip1hrString;
  }

  @JsonProperty("precip_1hr_string")
  public void setPrecip1hrString(String precip1hrString) {
    this.precip1hrString = precip1hrString;
  }

  @JsonProperty("precip_1hr_in")
  public String getPrecip1hrIn() {
    return this.precip1hrIn;
  }

  @JsonProperty("precip_1hr_in")
  public void setPrecip1hrIn(String precip1hrIn) {
    this.precip1hrIn = precip1hrIn;
  }

  @JsonProperty("precip_1hr_metric")
  public String getPrecip1hrMetric() {
    return this.precip1hrMetric;
  }

  @JsonProperty("precip_1hr_metric")
  public void setPrecip1hrMetric(String precip1hrMetric) {
    this.precip1hrMetric = precip1hrMetric;
  }

  @JsonProperty("precip_today_string")
  public String getPrecipTodayString() {
    return this.precipTodayString;
  }

  @JsonProperty("precip_today_string")
  public void setPrecipTodayString(String precipTodayString) {
    this.precipTodayString = precipTodayString;
  }

  @JsonProperty("precip_today_in")
  public String getPrecipTodayIn() {
    return this.precipTodayIn;
  }

  @JsonProperty("precip_today_in")
  public void setPrecipTodayIn(String precipTodayIn) {
    this.precipTodayIn = precipTodayIn;
  }

  @JsonProperty("precip_today_metric")
  public String getPrecipTodayMetric() {
    return this.precipTodayMetric;
  }

  @JsonProperty("precip_today_metric")
  public void setPrecipTodayMetric(String precipTodayMetric) {
    this.precipTodayMetric = precipTodayMetric;
  }

  @JsonProperty("icon")
  public String getIcon() {
    return this.icon;
  }

  @JsonProperty("icon")
  public void setIcon(String icon) {
    this.icon = icon;
  }

  @JsonProperty("icon_url")
  public String getIconUrl() {
    return this.iconUrl;
  }

  @JsonProperty("icon_url")
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  @JsonProperty("forecast_url")
  public String getForecastUrl() {
    return this.forecastUrl;
  }

  @JsonProperty("forecast_url")
  public void setForecastUrl(String forecastUrl) {
    this.forecastUrl = forecastUrl;
  }

  @JsonProperty("history_url")
  public String getHistoryUrl() {
    return this.historyUrl;
  }

  @JsonProperty("history_url")
  public void setHistoryUrl(String historyUrl) {
    this.historyUrl = historyUrl;
  }

  @JsonProperty("ob_url")
  public String getObUrl() {
    return this.obUrl;
  }

  @JsonProperty("ob_url")
  public void setObUrl(String obUrl) {
    this.obUrl = obUrl;
  }

  @JsonProperty("nowcast")
  public String getNowcast() {
    return this.nowcast;
  }

  @JsonProperty("nowcast")
  public void setNowcast(String nowcast) {
    this.nowcast = nowcast;
  }

}
