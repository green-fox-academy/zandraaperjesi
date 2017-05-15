package com.zandraa.perjesi.model;

import org.springframework.stereotype.Service;

@Service
public class CargoDTOService {
  final static int MAX_AMMO = 12500;
  String received;
  int amount;
  String shipstatus;
  boolean ready;
  Ship ship;
  Cargo cargo;

  public CargoDTOService() {}

  public CargoDTOService(Ship ship, String received, int amount) {
    this.received = received;
    this.amount = amount;
    this.ship = ship;
    this.cargo = new Cargo();
    this.shipstatus = ship.getShipstatus();
    this.ready = ship.isReady();
  }

  public void fillAmmo() {
    if(received.equals(".25")) {
      ship.setCaliber25(ship.getCaliber25() + amount);
    }
    else if(received.equals(".30")) {
      ship.setCaliber30(ship.getCaliber30() + amount);
    }
    else if(received.equals(".50")) {
      ship.setCaliber50(ship.getCaliber50() + amount);
    }
  }

  public void checkReady() {
    int ammoOnBoard = ship.getCaliber25() + ship.getCaliber30() + ship.getCaliber50();
    if(ammoOnBoard == 0) {
      ship.setShipstatus("empty");
    }
    else if(ammoOnBoard == MAX_AMMO) {
      ship.setShipstatus("full");
      ship.setReady(true);
    }
    else {
      ship.setShipstatus(ammoOnBoard / (MAX_AMMO / 100) + "%");
    }
  }

  public Cargo fill() {
    fillAmmo();
    checkReady();
    this.cargo.setReceived(this.received);
    this.cargo.setAmount(this.amount);
    this.cargo.setShipstatus(this.ship.getShipstatus());
    this.cargo.setReady(this.ship.isReady());
    return cargo;
  }
}
