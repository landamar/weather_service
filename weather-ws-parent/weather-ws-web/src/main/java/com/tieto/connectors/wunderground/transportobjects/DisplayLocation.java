
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
    "state_name",
    "country",
    "country_iso3166",
    "zip",
    "magic",
    "wmo",
    "latitude",
    "longitude",
    "elevation"
})
public class DisplayLocation implements Serializable {

  @JsonProperty("full")
  private String full;
  @JsonProperty("city")
  private String city;
  @JsonProperty("state")
  private String state;
  @JsonProperty("state_name")
  private String stateName;
  @JsonProperty("country")
  private String country;
  @JsonProperty("country_iso3166")
  private String countryIso3166;
  @JsonProperty("zip")
  private String zip;
  @JsonProperty("magic")
  private String magic;
  @JsonProperty("wmo")
  private String wmo;
  @JsonProperty("latitude")
  private String latitude;
  @JsonProperty("longitude")
  private String longitude;
  @JsonProperty("elevation")
  private String elevation;
  private final static long serialVersionUID = 4182405880050634720L;

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

  @JsonProperty("state_name")
  public String getStateName() {
    return this.stateName;
  }

  @JsonProperty("state_name")
  public void setStateName(String stateName) {
    this.stateName = stateName;
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

  @JsonProperty("zip")
  public String getZip() {
    return this.zip;
  }

  @JsonProperty("zip")
  public void setZip(String zip) {
    this.zip = zip;
  }

  @JsonProperty("magic")
  public String getMagic() {
    return this.magic;
  }

  @JsonProperty("magic")
  public void setMagic(String magic) {
    this.magic = magic;
  }

  @JsonProperty("wmo")
  public String getWmo() {
    return this.wmo;
  }

  @JsonProperty("wmo")
  public void setWmo(String wmo) {
    this.wmo = wmo;
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
