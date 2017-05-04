package com.zandraaperjesi.messageservice.service;

public class EmailService implements MessageService{
  @Override
  public void sendMessage(String s, String s1) {
    System.out.println(s + "email");
  }
}
