package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong idCount = new AtomicLong();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("idCount", idCount.addAndGet(1));
    model.addAttribute("hello", hellos[(int) (Math.random() * hellos.length)]);
    model.addAttribute("color", "color:rgb(" + (int)(Math.random() * 255) + ", " + (int)(Math.random() * 255) + ", " +  (int)(Math.random() * 255) + "); font-size: " + (int)(Math.random() * 70) + "px;");
    return "greeting";
  }
}
