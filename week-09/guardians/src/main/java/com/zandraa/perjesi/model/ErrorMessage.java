package com.zandraa.perjesi.model;

import org.springframework.stereotype.Service;

@Service
public class ErrorMessage {
  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }
}
