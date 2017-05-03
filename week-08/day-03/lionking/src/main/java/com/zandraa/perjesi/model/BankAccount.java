package com.zandraa.perjesi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankAccount {
  String name;
  long balance;
  String animalType;
  boolean isKing;
}
