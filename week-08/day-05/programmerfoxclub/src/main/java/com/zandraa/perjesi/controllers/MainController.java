package com.zandraa.perjesi.controllers;

import com.zandraa.perjesi.fox.Fox;
import com.zandraa.perjesi.fox.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping("/changeFood")
  public String add(@RequestParam("food") String food, @RequestParam("drink") String drink) throws InterruptedException {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }
}
