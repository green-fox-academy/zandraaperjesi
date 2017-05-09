package com.zandraa.perjesi;

import com.zandraa.perjesi.model.Todo;
import com.zandraa.perjesi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

  @Autowired
  TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("asdasddddd", true, true));
    todoRepository.save(new Todo("ljkgjkgjjkghjk;jk", false, true));
    todoRepository.save(new Todo("ppoiopilkfghn", true, false));
  }
}
