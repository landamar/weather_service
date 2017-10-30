package com.tieto.connectors.exception;

public class ConnectorException extends Exception {
  private static final long serialVersionUID = 119379216264376861L;

  public ConnectorException() {
    super();
  }

  public ConnectorException(String message) {
    super(message);
  }

  public ConnectorException(Throwable cause) {
    super(cause);
  }

  public ConnectorException(String message, Throwable cause) {
    super(message, cause);
  }
}
