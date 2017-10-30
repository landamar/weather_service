package com.tieto.config.properties.transportobjects;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "locations")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationTO {

  @XmlElement(name = "location")
  private List<Location> location;

  @Override
  public String toString() {
    return String.format("LocationTO [location=%s]", this.location);
  }

  public List<Location> getLocation() {
    return this.location;
  }

  public void setLocation(List<Location> location) {
    this.location = location;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.location == null) ? 0 : this.location.hashCode());
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
    final LocationTO other = (LocationTO) obj;
    if (this.location == null) {
      if (other.location != null) {
        return false;
      }
    } else if (!this.location.equals(other.location)) {
      return false;
    }
    return true;
  }

}