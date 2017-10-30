package com.tieto.objects.domain;

public class WindDO {
  private final String description;
  private final float speedKmh;
  private final String direction;

  private WindDO(Builder builder) {
    this.description = builder.description;
    this.speedKmh = builder.speedKmh;
    this.direction = builder.direction;
  }

  public String getDirection() {
    return this.direction;
  }

  public String getDescription() {
    return this.description;
  }

  public float getSpeedKmh() {
    return this.speedKmh;
  }

  public static class Builder {
    private String description;
    private float speedKmh;
    private String direction;

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder speedKmh(float speedKmh) {
      this.speedKmh = speedKmh;
      return this;
    }

    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    public WindDO build() {
      return new WindDO(this);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
    result = prime * result + ((this.direction == null) ? 0 : this.direction.hashCode());
    result = prime * result + Float.floatToIntBits(this.speedKmh);
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
    final WindDO other = (WindDO) obj;
    if (this.description == null) {
      if (other.description != null) {
        return false;
      }
    } else if (!this.description.equals(other.description)) {
      return false;
    }
    if (this.direction == null) {
      if (other.direction != null) {
        return false;
      }
    } else if (!this.direction.equals(other.direction)) {
      return false;
    }
    if (Float.floatToIntBits(this.speedKmh) != Float.floatToIntBits(other.speedKmh)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("WindDO [description=%s, speedKmh=%s, direction=%s]", this.description, this.speedKmh,
        this.direction);
  }

}
