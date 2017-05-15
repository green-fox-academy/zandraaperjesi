package com.zandraa.perjesi.repository;

import com.zandraa.perjesi.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {
  private List<Food> foodList = new ArrayList<>();

  public FoodRepository() {
    foodList.add(new Food("asd", 123, 456));
    foodList.add(new Food("gffggd", 333, 666));
  }

  public List<Food> getAll() {
    return foodList;
  }

  public List<Food> deleteFood(String name) {
    List<Food> buffer = new ArrayList<>();
    for (Food food : foodList) {
      if(food.getName() != name) {
        buffer.add(food);
      }
    }
    this.foodList = buffer;
    return foodList;
  }

  public List<Food> addFood(Food food) {
    foodList.add(food);
    return foodList;
  }

  public List<Food> changeAmount(String name, int amount) {
    for (Food food : foodList) {
      if (food.getName() == name) {
        food.setAmount(amount);
      }
    }
    return foodList;
  }
}
