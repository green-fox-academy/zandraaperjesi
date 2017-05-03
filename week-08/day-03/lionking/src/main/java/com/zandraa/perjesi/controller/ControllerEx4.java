package com.zandraa.perjesi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerEx4 {
  @RequestMapping("/exercise4")
  public String exerciseOne(Model model) {
    String s = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string",s);
    return "exercise4";
  }
}
