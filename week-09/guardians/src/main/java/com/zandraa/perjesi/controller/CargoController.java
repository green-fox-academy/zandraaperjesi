package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.Cargo;
import com.zandraa.perjesi.model.CargoDTOService;
import com.zandraa.perjesi.model.ErrorMessage;
import com.zandraa.perjesi.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CargoController {

  @Autowired
  Ship ship;

  @GetMapping("/rocket")
  public Ship ship() {
    return ship;
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
  public ErrorMessage errorHandler() {
    return new ErrorMessage("No params!");
  }

  @GetMapping("/rocket/fill")
  public Cargo cargoDTOService(@RequestParam("caliber") String received, @RequestParam("amount") int amount) {
    return new CargoDTOService(ship, received, amount).fill();
  }
}
