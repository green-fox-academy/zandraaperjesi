package com.zandraa.perjesi.controller;
import com.zandraa.perjesi.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerEx5 {
  @RequestMapping("/exercise5")
  public String exerciseOne(Model model) {
    List<BankAccount> accounts= new ArrayList<>();
    BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion", false, true);
    BankAccount mufasaAcc = new BankAccount("Mufasa", 112000, "lion", true, true);
    BankAccount scarAcc = new BankAccount("Scar", 5000, "lion", false, false);
    BankAccount nalaAcc = new BankAccount("Rafiki", 2000, "mandrill", false, true);
    BankAccount zazuAcc = new BankAccount("Zazu", 6000, "hornbill", false, true);
    accounts.add(simbaAcc);
    accounts.add(mufasaAcc);
    accounts.add(scarAcc);
    accounts.add(nalaAcc);
    accounts.add(zazuAcc);
    model.addAttribute("accounts",accounts);
    return "exercise5";
  }
}
