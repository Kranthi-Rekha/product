package com.products.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	 
		
		  //declare passwordencoder
		  
			/*
			 * @Bean public PasswordEncoder passwordEncoder() { return new
			 * BCryptPasswordEncoder(); }
			 */
	  
	  //provide the security config for particular pages or http calls
	  @Bean 
	  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		  
		http 
		  .csrf().disable() 
		  .authorizeHttpRequests(auth -> auth
		  .requestMatchers("/products/").permitAll()
		  .requestMatchers("/products/**").hasRole("ADMIN")
		  .anyRequest().authenticated() )
		  
		  .httpBasic();
		  
		  return http.build(); 
	  }

}
