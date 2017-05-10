package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.AAppender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

  @GetMapping("/appenda/{appendable}")
  public AAppender appendA(@PathVariable("appendable") String appendable) {
    return new AAppender(appendable);
  }
}
