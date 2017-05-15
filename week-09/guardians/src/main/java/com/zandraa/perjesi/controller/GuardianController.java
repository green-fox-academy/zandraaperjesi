package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.GrootService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("Please provide an number!");
  }

  @GetMapping("/groot")
  public GrootService grootSpeaks(@RequestPart("message") String message) {
    return new GrootService();
  }
}
