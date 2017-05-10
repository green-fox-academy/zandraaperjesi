package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.Greeter;
import com.zandraa.perjesi.model.NumDouble;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class JsController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("Please provide an input!");
  }

  @GetMapping("/doubling")
  public NumDouble doubler(@RequestParam(name = "input") int input) {
    return new NumDouble(input);
  }
}
