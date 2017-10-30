package com.tieto.config.properties.transportobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
  @XmlAttribute(required = true)
  private String country;
  @XmlAttribute(required = true)
  private String city;

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
    result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
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
    final Location other = (Location) obj;
    if (this.city == null) {
      if (other.city != null) {
        return false;
      }
    } else if (!this.city.equals(other.city)) {
      return false;
    }
    if (this.country == null) {
      if (other.country != null) {
        return false;
      }
    } else if (!this.country.equals(other.country)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("Location [country=%s, city=%s]", this.country, this.city);
  }

}
