package com.tieto.objects.domain;

public class HumidityDO {
  private final float humValue;

  private HumidityDO(Builder builder) {
    this.humValue = builder.humValue;
  }

  public float getHumValue() {
    return this.humValue;
  }

  @Override
  public String toString() {
    return String.format("HumidityDO [humValue=%s]", this.humValue);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(this.humValue);
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
    final HumidityDO other = (HumidityDO) obj;
    if (Float.floatToIntBits(this.humValue) != Float.floatToIntBits(other.humValue)) {
      return false;
    }
    return true;
  }

  public static class Builder {
    private float humValue;

    public Builder humValue(float humValue) {
      this.humValue = humValue;
      return this;
    }

    public HumidityDO build() {
      return new HumidityDO(this);
    }
  }
}
