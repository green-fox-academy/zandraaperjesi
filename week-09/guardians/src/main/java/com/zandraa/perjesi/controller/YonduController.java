package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class YonduController {

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("No params!");
  }

  @GetMapping("/yondu")
  public Yondu yondusArrow(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    return new Yondu(distance, time);
  }
}
