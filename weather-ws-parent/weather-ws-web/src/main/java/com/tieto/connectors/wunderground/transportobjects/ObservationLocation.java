
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "full",
    "city",
    "state",
    "country",
    "country_iso3166",
    "latitude",
    "longitude",
    "elevation"
})
public class ObservationLocation implements Serializable {

  @JsonProperty("full")
  private String full;
  @JsonProperty("city")
  private String city;
  @JsonProperty("state")
  private String state;
  @JsonProperty("country")
  private String country;
  @JsonProperty("country_iso3166")
  private String countryIso3166;
  @JsonProperty("latitude")
  private String latitude;
  @JsonProperty("longitude")
  private String longitude;
  @JsonProperty("elevation")
  private String elevation;
  private final static long serialVersionUID = 4933018985483720706L;

  @JsonProperty("full")
  public String getFull() {
    return this.full;
  }

  @JsonProperty("full")
  public void setFull(String full) {
    this.full = full;
  }

  @JsonProperty("city")
  public String getCity() {
    return this.city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("state")
  public String getState() {
    return this.state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonProperty("country")
  public String getCountry() {
    return this.country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("country_iso3166")
  public String getCountryIso3166() {
    return this.countryIso3166;
  }

  @JsonProperty("country_iso3166")
  public void setCountryIso3166(String countryIso3166) {
    this.countryIso3166 = countryIso3166;
  }

  @JsonProperty("latitude")
  public String getLatitude() {
    return this.latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  @JsonProperty("longitude")
  public String getLongitude() {
    return this.longitude;
  }

  @JsonProperty("longitude")
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  @JsonProperty("elevation")
  public String getElevation() {
    return this.elevation;
  }

  @JsonProperty("elevation")
  public void setElevation(String elevation) {
    this.elevation = elevation;
  }

}
