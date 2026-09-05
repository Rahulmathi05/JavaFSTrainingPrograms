package com.training.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {
    private final OrderRepository orderRepository;
    private final EmailNotificationsService notificationService;

    @Autowired
    public OrderServices(OrderRepository orderRepository,EmailNotificationsService notificationService){
    this.orderRepository = orderRepository;
    this.notificationService = notificationService;

}
public void completeOrder(Order order){
    System.out.println("BUSINESS LOGIC : Processing Order " + order.getorderId());
    orderRepository.save(order);
    notificationService.sendConfirmation(order);
}
}
