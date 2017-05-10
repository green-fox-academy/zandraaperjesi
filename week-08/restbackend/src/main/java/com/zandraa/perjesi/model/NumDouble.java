package com.zandraa.perjesi.model;

import org.springframework.stereotype.Service;

public class NumDouble {
  int received;
  int result;

  public NumDouble(int i) {
    this.received = i;
    this.result = i * 2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
