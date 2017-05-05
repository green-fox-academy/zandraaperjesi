package com.zandraa.perjesi.controllers;

import com.zandraa.perjesi.fox.Fox;
import com.zandraa.perjesi.fox.Trick;
import com.zandraa.perjesi.fox.TrickList;
import com.zandraa.perjesi.fox.UnlearnedTricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @Autowired
  UnlearnedTricks tricksToLearn;

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

  @RequestMapping("/trickCenter")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricksToLearn", tricksToLearn);
    return "trickCenter";
  }

  @RequestMapping("/changeFood")
  public String add(@RequestParam("food") String food, @RequestParam("drink") String drink) throws InterruptedException {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping("/learnTrick")
  public String learn(@RequestParam("newTrick") String trick) throws InterruptedException {
    fox.tricks.add(new Trick(trick));
    for (int i = 0; i < tricksToLearn.list.size(); i++) {
      if (trick.equals(tricksToLearn.list.get(i).name)) {
        tricksToLearn.list.remove(i);
        System.out.println("deleted");
      }
    }
    return "redirect:/";
  }
}
