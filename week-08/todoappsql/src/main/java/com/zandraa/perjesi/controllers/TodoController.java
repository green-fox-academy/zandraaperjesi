package com.zandraa.perjesi.controllers;

import com.zandraa.perjesi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("notes", todoRepository.findAll());
    return "todo";
  }
}
