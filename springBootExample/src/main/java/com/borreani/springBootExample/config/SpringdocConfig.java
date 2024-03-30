package com.borreani.springBootExample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;



@Configuration
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
public class SpringdocConfig {


}
