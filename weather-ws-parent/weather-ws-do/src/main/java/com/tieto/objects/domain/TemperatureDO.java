package com.tieto.objects.domain;

public class TemperatureDO {
  private final float celsiusValue;

  private TemperatureDO(Builder builder) {
    this.celsiusValue = builder.celsiusValue;
  }

  public float getCelsiusValue() {
    return this.celsiusValue;
  }

  @Override
  public String toString() {
    return String.format("TemperatureDO [celsiusValue=%s]", this.celsiusValue);
  }

  public float getFahrenheit() {

    return this.celsiusValue * 1.8f + 32.0f;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(this.celsiusValue);
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
    final TemperatureDO other = (TemperatureDO) obj;
    if (Float.floatToIntBits(this.celsiusValue) != Float.floatToIntBits(other.celsiusValue)) {
      return false;
    }
    return true;
  }

  public static class Builder {
    private float celsiusValue;

    public Builder celsiusValue(float celsiusValue) {
      this.celsiusValue = celsiusValue;
      return this;
    }

    public TemperatureDO build() {
      return new TemperatureDO(this);
    }
  }

}
