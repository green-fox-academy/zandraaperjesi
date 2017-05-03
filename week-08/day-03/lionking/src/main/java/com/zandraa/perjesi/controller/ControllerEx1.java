package com.zandraa.perjesi.controller;

import com.zandraa.perjesi.model.BankAccount;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerEx1 {

  BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion");
}
