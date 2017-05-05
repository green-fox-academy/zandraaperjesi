package com.zandraa.perjesi.fox;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {
  String name;
  List<Trick> tricks;
  String food;
  String drink;

  public Fox() {
    this.name = "Mr. Green";
    this.tricks = new ArrayList<>();
    Trick trick1 = new Trick("trick one");
    tricks.add(trick1);
    this.food = "food";
    this.drink = "drink";
  }
}
