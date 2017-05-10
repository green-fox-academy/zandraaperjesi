package com.zandraa.perjesi.model;

public class AAppender {
  String appended;

  public AAppender(String s) {
    this.appended = s + "a";
  }

  public String getAppended() {
    return appended;
  }
}
