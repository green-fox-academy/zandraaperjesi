package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong idCOunt = new AtomicLong();
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    String greet = "Hello, " + name;
    return new Greeting(idCOunt.addAndGet(1), greet);
  }
}
