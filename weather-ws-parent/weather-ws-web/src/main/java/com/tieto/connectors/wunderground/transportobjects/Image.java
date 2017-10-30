
package com.tieto.connectors.wunderground.transportobjects;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "url",
    "title",
    "link"
})
public class Image implements Serializable {

  @JsonProperty("url")
  private String url;
  @JsonProperty("title")
  private String title;
  @JsonProperty("link")
  private String link;
  private final static long serialVersionUID = -3295111983296975975L;

  @JsonProperty("url")
  public String getUrl() {
    return this.url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty("title")
  public String getTitle() {
    return this.title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("link")
  public String getLink() {
    return this.link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

}
