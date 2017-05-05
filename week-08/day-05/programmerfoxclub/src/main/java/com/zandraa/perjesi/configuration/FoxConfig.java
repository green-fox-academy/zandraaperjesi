package com.zandraa.perjesi.configuration;

import com.zandraa.perjesi.fox.Fox;
import com.zandraa.perjesi.fox.TrickList;
import com.zandraa.perjesi.fox.UnlearnedTricks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {
  @Bean
  public Fox fox() {
    return new Fox();
  }

  @Bean
  public TrickList trickList() {
    return new TrickList();
  }

  @Bean
  public UnlearnedTricks unlearnedTricks() {
    return new UnlearnedTricks();
  }
}
