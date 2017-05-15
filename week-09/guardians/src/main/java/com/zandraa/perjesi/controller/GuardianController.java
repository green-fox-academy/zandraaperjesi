package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.GrootService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("I am Groot!");
  }

  @GetMapping("/groot")
  public GrootService grootSpeaks(@RequestParam("message") String message) {
    return new GrootService(message);
  }
}
