package com.springboot.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.App.App;

@Configuration
public class Config {
	
	public Config() {
		System.out.println("-------Config class");
	}
	
	@Bean
	public App get() {
		App a =new App();
			return a;
		}

	
}
