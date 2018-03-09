package com.revature.hydra.grade.config;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.google.gson.JsonObject;
import com.revature.beans.Grade;
import com.revature.hydra.grade.service.GradeCompositionMessagingService;
import com.revature.hydra.grade.service.GradeCompositionService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableEurekaClient
public class GradeCompositionServiceConfiguration {
//	@Autowired
//	GradeCompositionService gcs;
//		@Autowired
//		private GradeCompositionMessagingService mms;
	   @Bean
	   public AmqpTemplate rabbitTemplate(ConnectionFactory factory) {
	  //     RabbitTemplate rabbitTemplate = new RabbitTemplate(factory);
	  //     rabbitTemplate.setExchange("revature.hydra.repos");
	       return new RabbitTemplate(factory);
	   }
	   
	   @Bean
		public GradeCompositionService gradeCompositionService() {
			return new GradeCompositionService();
		}
	   
		@Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.revature.hydra.grade.controller"))              
	          .paths(PathSelectors.any())                          
	          .build();
	    }
	   /*
	   @Bean
		public CommandLineRunner runner() {
		  
			return args -> {
				Grade grade = gcs.findOne((long) 2063);
				if(grade == null) {
					System.out.println("grade is null");
				}
				System.out.println(grade);
			};
			
		}
	  */
}
