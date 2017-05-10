package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.Calculator;
import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.Input;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("Please provide an number!");
  }

  @PostMapping("/dountil/{what}")
  public Calculator calculator(@PathVariable("what") String what, @RequestBody Input until) {
    Calculator myCalculator = new Calculator();
    if(what.equals("sum")) {
      myCalculator.sumNum(until.getUntil());
    }
    else if(what.equals("factor")) {
      myCalculator.factorNum(until.getUntil());
    }
    return myCalculator;
  }
}
