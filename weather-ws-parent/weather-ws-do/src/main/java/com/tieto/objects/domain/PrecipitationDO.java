package com.tieto.objects.domain;

public class PrecipitationDO {
  private final Float valueMmHod;
  private final Float valueMmToday;

  private PrecipitationDO(Builder builder) {
    super();
    this.valueMmHod = builder.valueMmHod;
    this.valueMmToday = builder.valueMmToday;
  }

  public Float getValueMmHod() {
    return this.valueMmHod;
  }

  public Float getValueMmToday() {
    return this.valueMmToday;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.valueMmHod == null) ? 0 : this.valueMmHod.hashCode());
    result = prime * result + ((this.valueMmToday == null) ? 0 : this.valueMmToday.hashCode());
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
    final PrecipitationDO other = (PrecipitationDO) obj;
    if (this.valueMmHod == null) {
      if (other.valueMmHod != null) {
        return false;
      }
    } else if (!this.valueMmHod.equals(other.valueMmHod)) {
      return false;
    }
    if (this.valueMmToday == null) {
      if (other.valueMmToday != null) {
        return false;
      }
    } else if (!this.valueMmToday.equals(other.valueMmToday)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("PrecipitationDO [valueMmHod=%s, valueMmToday=%s]", this.valueMmHod, this.valueMmToday);
  }

  public static class Builder {
    private float valueMmHod;
    private float valueMmToday;

    public Builder valueMmHod(float valueMmHod) {
      this.valueMmHod = valueMmHod;
      return this;
    }

    public Builder valueMmToday(float valueMmToday) {
      this.valueMmToday = valueMmToday;
      return this;
    }

    public PrecipitationDO build() {
      return new PrecipitationDO(this);
    }
  }

}
