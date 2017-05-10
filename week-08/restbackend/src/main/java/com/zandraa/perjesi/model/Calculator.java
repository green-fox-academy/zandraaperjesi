package com.zandraa.perjesi.model;

public class Calculator {
  int result;

  public int getResult() {
    return result;
  }

  public void sumNum(int toCalc) {
    int temp = 0;
    for (int i = 1; i < toCalc + 1; i++) {
      temp += i;
    }
    result = temp;
  }

  public void factorNum(int toCalc) {
    int temp = 1;
    for (int i = 1; i < toCalc + 1; i++) {
      temp *= i;
    }
    result = temp;
  }
}
