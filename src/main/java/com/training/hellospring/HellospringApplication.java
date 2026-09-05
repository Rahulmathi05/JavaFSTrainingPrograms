package com.training.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HellospringApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(HellospringApplication.class, args);


        OrderServices orderServices = context .getBean(OrderServices.class);
        Order newOrder = new Order ("ORD-9982", 250.00);
        orderServices.completeOrder(newOrder);

    }

}
