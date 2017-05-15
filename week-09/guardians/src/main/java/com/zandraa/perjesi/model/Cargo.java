package com.zandraa.perjesi.model;

public class Cargo {
  String received;
  int amount;
  String shipstatus;
  boolean ready;

  public Cargo() {}

//  public Cargo(String received, int amount) {
//    this.received = received;
//    this.amount = amount;
//  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
