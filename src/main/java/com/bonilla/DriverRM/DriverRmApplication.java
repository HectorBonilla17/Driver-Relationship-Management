package com.bonilla.DriverRM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DriverRmApplication extends SpringBootServletInitializer {
	 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DriverRmApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DriverRmApplication.class, args);
	}

}
