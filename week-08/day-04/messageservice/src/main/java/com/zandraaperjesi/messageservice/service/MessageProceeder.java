package com.zandraaperjesi.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageProceeder {
  @Autowired
  MessageService messageService;

  public void sendMessage(String s, String s1) {
    messageService.sendMessage(s, s1);
  }
}
