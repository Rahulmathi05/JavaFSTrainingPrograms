package com.training.hellospring;

import org.springframework.stereotype.Service;

    @Service
    public class EmailNotificationsService {
        public void sendConfirmation( Order order){
            System.out.println("EMAIL: Notification sent for order" + order.getorderId());
        }
    }

