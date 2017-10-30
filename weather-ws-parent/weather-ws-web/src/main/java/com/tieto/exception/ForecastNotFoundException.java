package com.tieto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "This forecast is not found in the system, please check LOG")
public class ForecastNotFoundException extends Exception {

  private static final long serialVersionUID = 1L;

  public ForecastNotFoundException() {
    super();
  }

  public ForecastNotFoundException(String arg0) {
    super(arg0);
  }

}
