package com.zandraaperjesi.messageservice.service;

public class TwitterService implements MessageService{
  @Override
  public void sendMessage(String s, String s1) {
    System.out.println(s + "twitter");
  }
}
