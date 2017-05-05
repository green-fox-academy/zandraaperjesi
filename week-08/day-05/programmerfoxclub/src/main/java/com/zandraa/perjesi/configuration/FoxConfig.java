package com.zandraa.perjesi.configuration;

import com.zandraa.perjesi.fox.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {
  @Bean
  public Fox fox() {
    return new Fox();
  }
}
