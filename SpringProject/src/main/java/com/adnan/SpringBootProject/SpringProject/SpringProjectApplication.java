package com.adnan.SpringBootProject.SpringProject;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ServiceConsumer service = new ServiceConsumer(context.getBean(FirstService.class));
		service.setSecondService(context.getBean(SecondService.class));

		service.displayMessages();

	}

}
