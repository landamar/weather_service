
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "version",
    "termsofService",
    "features"
})
public class Response implements Serializable {

  @JsonProperty("version")
  private String version;
  @JsonProperty("termsofService")
  private String termsofService;
  @JsonProperty("features")
  private Features features;
  private final static long serialVersionUID = 4230600847949227300L;

  @JsonProperty("version")
  public String getVersion() {
    return this.version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  @JsonProperty("termsofService")
  public String getTermsofService() {
    return this.termsofService;
  }

  @JsonProperty("termsofService")
  public void setTermsofService(String termsofService) {
    this.termsofService = termsofService;
  }

  @JsonProperty("features")
  public Features getFeatures() {
    return this.features;
  }

  @JsonProperty("features")
  public void setFeatures(Features features) {
    this.features = features;
  }

}
