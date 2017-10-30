package com.tieto.objects.domain;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TimeStamp {
  private final long epochTime;
  private final String formatedTime;

  public TimeStamp(Instant time) {
    super();
    this.epochTime = time.toEpochMilli();
    final DateTimeFormatter formatter = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.SHORT)
        .withLocale(Locale.UK)
        .withZone(ZoneId.systemDefault());
    this.formatedTime = formatter.format(time);
  }

  public long getEpochTime() {
    return this.epochTime;
  }

  public String getFormatedTime() {
    return this.formatedTime;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (this.epochTime ^ (this.epochTime >>> 32));
    result = prime * result + ((this.formatedTime == null) ? 0 : this.formatedTime.hashCode());
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
    final TimeStamp other = (TimeStamp) obj;
    if (this.epochTime != other.epochTime) {
      return false;
    }
    if (this.formatedTime == null) {
      if (other.formatedTime != null) {
        return false;
      }
    } else if (!this.formatedTime.equals(other.formatedTime)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("TimeStamp [epochTime=%s, formatedTime=%s]", this.epochTime, this.formatedTime);
  }

}
