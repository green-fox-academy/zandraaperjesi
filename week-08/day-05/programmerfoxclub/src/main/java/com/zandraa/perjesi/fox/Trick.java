package com.zandraa.perjesi.fox;

public class Trick {
  private static int lastId = 0;
  public String name;
  public int id;

  public Trick(String s) {
    name = s;
    id = lastId;
    lastId++;
  }
}
