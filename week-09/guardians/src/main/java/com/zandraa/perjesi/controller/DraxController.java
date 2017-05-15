package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.Food;
import com.zandraa.perjesi.model.FoodService;
import com.zandraa.perjesi.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
