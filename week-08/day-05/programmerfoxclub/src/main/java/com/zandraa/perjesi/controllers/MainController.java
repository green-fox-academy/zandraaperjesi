package com.zandraa.perjesi.controllers;

import com.zandraa.perjesi.fox.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore(Model model) {
    model.addAttribute("fox", fox);
    return "nutritionStore";
  }
}
