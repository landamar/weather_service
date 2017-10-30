
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "conditions"
})
public class Features implements Serializable {

  @JsonProperty("conditions")
  private int conditions;
  private final static long serialVersionUID = -7178048641643013977L;

  @JsonProperty("conditions")
  public int getConditions() {
    return this.conditions;
  }

  @JsonProperty("conditions")
  public void setConditions(int conditions) {
    this.conditions = conditions;
  }

}
