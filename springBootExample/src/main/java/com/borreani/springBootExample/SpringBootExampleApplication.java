package com.borreani.springBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.info.Contact; 


@SpringBootApplication
// OpenAPIDefinition is used to define the metadata print to page of swagger
@OpenAPIDefinition( 
	info = @Info(
		title = "Spring Boot Example",
		version = "1.0.0",
		description = "A short project to show how to use Spring Boot with Swagger.",
		termsOfService = "http://swagger.io/terms/",
		contact = @Contact(
			name = "Borreani",
			email = "Contact no found"
		),
		license = @License(
			name = "Apache 2.0",
			url = "http://www.apache.org/licenses/LICENSE-2.0.html"
		)
	)
)
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	

}
