package com.zandraa.perjesi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldappApplication implements CommandLineRunner{
  @Autowired
  HelloWorld hw;

  @Autowired
  RedColor red;

  public static void main(String[] args) {
    SpringApplication.run(HelloworldappApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    hw.setMessage("Hello, world!");
    hw.getMessage();
    red.printColor();
  }
}