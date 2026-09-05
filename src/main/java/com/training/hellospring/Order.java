package com.training.hellospring;

public class Order {
    private String orderId;
    private  double amount;
    public Order(String orderId, double amount){
        this.orderId = orderId;
        this.amount = amount;
    }
    public String getorderId() { return orderId;}
    public void setOrderId(String orderId) { this.orderId = orderId;}
    public double getAmount() { return amount;}
    public void setamount(double amount) { this.amount = amount;}
}
