package com.training.hellospring;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
   public void save (Order order){
       System.out.println("DATABASE: Saving order " + order.getorderId() + "to the database");

   }
}
