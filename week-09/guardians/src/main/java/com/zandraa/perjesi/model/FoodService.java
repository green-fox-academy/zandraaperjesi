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
}
