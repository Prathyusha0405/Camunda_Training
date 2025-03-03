package com.example.SpringBootCamunda;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Deployment(resources = "classpath:send-email.bpmn")
public class SpringBootCamundaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamundaApplication.class, args);
	}

}
