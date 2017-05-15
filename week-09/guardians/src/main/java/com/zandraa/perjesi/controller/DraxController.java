package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.Food;
import com.zandraa.perjesi.model.FoodService;
import com.zandraa.perjesi.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DraxController {

  @Autowired
  FoodService foodService;

  @GetMapping("/drax")
  public List<Food> allFood() {
    return foodService.allFood();
  }

  @GetMapping("/drax/add")
  public List<Food> addFood(@RequestParam("name") String name, @RequestParam("calorie") int calorie, @RequestParam("amount") int amount) {
    return foodService.addFood(name, calorie, amount);
  }

  @GetMapping("/drax/delete")
  public List<Food> deleteFood(@RequestParam("name") String name) {
    return foodService.deleteFood(name);
  }

  @GetMapping("/drax/change")
  public List<Food> changeAmount(@RequestParam("name") String name, @RequestParam("amount") int amount) {
    return foodService.changeAmount(name, amount);
  }
}
