package com.zandraa.perjesi.fox;

import java.util.ArrayList;
import java.util.List;

public class TrickList {
  public List<Trick> list = new ArrayList<>();

  public List<Trick> getTricks() {
    return list;
  }

  public void add(Trick t) {
    list.add(t);
  }
}
