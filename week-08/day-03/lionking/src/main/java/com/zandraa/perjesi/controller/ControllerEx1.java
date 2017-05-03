package com.zandraa.perjesi.controller;
import com.zandraa.perjesi.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerEx1 {
  @RequestMapping("/exercise1")
  public String exerciseOne(Model model) {
    BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion", false);
    model.addAttribute("simbaAcc",simbaAcc);
    return "index";
  }
}
