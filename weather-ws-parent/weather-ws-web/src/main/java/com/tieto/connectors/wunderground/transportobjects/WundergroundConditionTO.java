
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "response",
    "current_observation"
})
public class WundergroundConditionTO implements Serializable {

  @JsonProperty("response")
  private Response response;
  @JsonProperty("current_observation")
  private CurrentObservation currentObservation;
  private final static long serialVersionUID = 8742783205802535214L;

  @JsonProperty("response")
  public Response getResponse() {
    return this.response;
  }

  @JsonProperty("response")
  public void setResponse(Response response) {
    this.response = response;
  }

  @JsonProperty("current_observation")
  public CurrentObservation getCurrentObservation() {
    return this.currentObservation;
  }

  @JsonProperty("current_observation")
  public void setCurrentObservation(CurrentObservation currentObservation) {
    this.currentObservation = currentObservation;
  }

}
