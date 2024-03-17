package com.sureshIT2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@OpenAPIDefinition(info=@Info(title="Basic Crud", version="1.0",description="saneer" ))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
