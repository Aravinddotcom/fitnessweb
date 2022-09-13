package com.fitnessapp.foodproduct;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FoodproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodproductApplication.class, args);
		System.out.println("Food Product Microservice running..");
	}
	@Bean
    public Docket configureSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.ant("/**")) 
                .apis(RequestHandlerSelectors.basePackage("com.fitnessapp.foodproduct.controller")).build()
                .apiInfo(apiInfo());
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfo("Protein Products Api", "Sample API for CaloriesValues", "1.0", "path/to/terms",
                new Contact("Fitnessweb", "http://localhost:4200", "fitnessweb@gmail.com"), "API License",
                "http://www.google.com", Collections.emptyList());
    }

}
