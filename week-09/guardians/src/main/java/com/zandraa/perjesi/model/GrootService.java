package com.zandraa.perjesi.model;

import org.springframework.stereotype.Service;

@Service
public class GrootService {
  private String message;
  private String translated;

  public GrootService() {}

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public GrootService(String message) {
    this.message = message;
    this.translated = "I am Groot!";
  }
}
