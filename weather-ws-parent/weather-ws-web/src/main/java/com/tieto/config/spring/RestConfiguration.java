package com.tieto.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tieto")
public class RestConfiguration {

// @Bean
// public MappingJackson2HttpMessageConverter jackson2Converter() {
// final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
// converter.setObjectMapper(objectMapper());
// return converter;
// }

  @Bean
  @ApplicationScope
  public ObjectMapper objectMapper() {
    final ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper;
  }
}
