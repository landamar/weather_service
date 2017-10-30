package com.tieto.objects.domain;

public class ClientErrorInformation {
  private String exception;
  private String requestURI;

  public ClientErrorInformation(final String exception, final String requestURI) {
    this.exception = exception;
    this.requestURI = requestURI;
  }

  public String getException() {
    return this.exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public String getRequestURI() {
    return this.requestURI;
  }

  public void setRequestURI(String requestURI) {
    this.requestURI = requestURI;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.exception == null) ? 0 : this.exception.hashCode());
    result = prime * result + ((this.requestURI == null) ? 0 : this.requestURI.hashCode());
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
    final ClientErrorInformation other = (ClientErrorInformation) obj;
    if (this.exception == null) {
      if (other.exception != null) {
        return false;
      }
    } else if (!this.exception.equals(other.exception)) {
      return false;
    }
    if (this.requestURI == null) {
      if (other.requestURI != null) {
        return false;
      }
    } else if (!this.requestURI.equals(other.requestURI)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("ClientErrorInformation [exception=%s, requestURI=%s]", this.exception, this.requestURI);
  }

}
