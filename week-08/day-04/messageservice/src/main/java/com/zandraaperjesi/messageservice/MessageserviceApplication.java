package com.zandraaperjesi.messageservice;

import com.zandraaperjesi.messageservice.service.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan

public class MessageserviceApplication implements CommandLineRunner{

  @Autowired
  MessageProceeder messageProceeder;

	public static void main(String[] args) {
		SpringApplication.run(MessageserviceApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    messageProceeder.sendMessage("Hi Barba, How are you?", "office@greenfox.com");
  }
}
