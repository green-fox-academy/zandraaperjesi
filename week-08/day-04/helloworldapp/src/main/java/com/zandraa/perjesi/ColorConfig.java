package com.zandraa.perjesi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

  @Bean
  public RedColor myColor() {
    return new RedColor();
  }
}