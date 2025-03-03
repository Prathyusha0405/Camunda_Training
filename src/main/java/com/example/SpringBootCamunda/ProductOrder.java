package com.example.SpringBootCamunda;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class ProductOrder {
    @JobWorker(type = "ProductOrder", autoComplete = true)
    public void getProduct() {
        System.out.println("*****Service Task Execution*****");
    }
}
