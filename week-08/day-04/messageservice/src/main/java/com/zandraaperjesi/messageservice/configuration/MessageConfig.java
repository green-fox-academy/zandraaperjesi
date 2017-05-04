package com.zandraaperjesi.messageservice.configuration;

import com.zandraaperjesi.messageservice.service.EmailService;
import com.zandraaperjesi.messageservice.service.MessageProceeder;
import com.zandraaperjesi.messageservice.service.MessageService;
import com.zandraaperjesi.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
  @Bean
  public MessageService emailService() {
    return new EmailService();
  }

  public MessageService twitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

}
