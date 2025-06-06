package com.cocoawerks.MosaicOAuth.server;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .authorizeHttpRequests(
        authorize -> {
          authorize.requestMatchers("/gwt/service/**").authenticated();
          authorize.anyRequest().permitAll();
        }
      )
      .oauth2Login(withDefaults());
    return http.build();
  }
}
