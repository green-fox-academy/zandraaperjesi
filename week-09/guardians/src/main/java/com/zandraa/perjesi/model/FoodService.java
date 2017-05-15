package com.zandraa.perjesi.model;

import com.zandraa.perjesi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

  @Autowired
  FoodRepository foodRepository;

  public List<Food> allFood() {
    return foodRepository.getAll();
  }

  public List<Food> addFood(String name, int calorie, int amount) {
    return foodRepository.addFood(new Food(name, calorie, amount));
  }

  public List<Food> deleteFood(String name) {
    return foodRepository.deleteFood(name);
  }
  
  public List<Food> changeAmount(String name, int amount) {
    return foodRepository.changeAmount(name, amount);
  }
}
