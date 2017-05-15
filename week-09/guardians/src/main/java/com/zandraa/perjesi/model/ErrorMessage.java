package com.zandraa.perjesi.model;

import org.springframework.stereotype.Service;

@Service
public class ErrorMessage {

  public ErrorMessage() {}

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }
}
