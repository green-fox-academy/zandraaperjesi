package com.zandraaperjesi.messageservice.service;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageService {
  void sendMessage(String s, String s1);
}
