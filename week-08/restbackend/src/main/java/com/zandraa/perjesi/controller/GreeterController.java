package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage errorHandler(MissingServletRequestParameterException ex) {
    String missing = ex.getParameterName();
    String toPass = "Please provide a " + missing + "!";
    return new ErrorMessage(toPass);
  }

  @GetMapping("/greeter")
  public Greeter studentGreeter(@RequestParam(name = "name") String name, @RequestParam(name = "title") String title) {
    return new Greeter(name, title);
  }
}
