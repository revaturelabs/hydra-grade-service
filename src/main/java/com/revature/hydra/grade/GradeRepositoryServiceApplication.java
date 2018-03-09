package com.revature.hydra.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.revature.hydra.grade.data.GradeRepository;
import com.revature.hydra.grade.service.GradeCompositionService;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(value = "com.revature.beans")
public class GradeRepositoryServiceApplication {
//	@Autowired
//	GradeCompositionService gcs;
	public static void main(String[] args) {
		SpringApplication.run(GradeRepositoryServiceApplication.class, args);
	}
	
/*	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.revature.hydra.grade.controller"))              
          .paths(PathSelectors.any())                          
          .build();
    }*/
}
