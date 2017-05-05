package com.zandraa.perjesi.fox;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {
  String name;
  public TrickList tricks;
  String food;
  String drink;

  public Fox() {
    this.name = "Mr. Green";
    this.tricks = new TrickList();
    Trick trick1 = new Trick("trick one");
    tricks.add(trick1);
    this.food = "food";
    this.drink = "drink";
  }

  public void setFood(String s) {
    this.food = s;
  }

  public void setDrink(String s) {
    this.drink = s;
  }
}
