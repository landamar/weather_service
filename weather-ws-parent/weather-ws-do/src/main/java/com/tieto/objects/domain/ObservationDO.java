package com.tieto.objects.domain;

import java.time.Instant;

public class ObservationDO {
  private final String place;
  private final TimeStamp time;

  private ObservationDO(Builder builder) {
    this.place = builder.place;
    this.time = new TimeStamp(builder.time);

  }

  public String getPlace() {
    return this.place;
  }

  public TimeStamp getTime() {
    return this.time;
  }

  public static class Builder {
    private String place;
    private Instant time;

    public Builder place(String place) {
      this.place = place;
      return this;
    }

    public Builder time(Instant time) {
      this.time = time;
      return this;
    }

    public ObservationDO build() {
      return new ObservationDO(this);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.place == null) ? 0 : this.place.hashCode());
    result = prime * result + ((this.time == null) ? 0 : this.time.hashCode());
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
    final ObservationDO other = (ObservationDO) obj;
    if (this.place == null) {
      if (other.place != null) {
        return false;
      }
    } else if (!this.place.equals(other.place)) {
      return false;
    }
    if (this.time == null) {
      if (other.time != null) {
        return false;
      }
    } else if (!this.time.equals(other.time)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("ObservationDO [place=%s, time=%s]", this.place, this.time);
  }

}
