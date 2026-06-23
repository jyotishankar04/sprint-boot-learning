package com.example.loose;

public class SMSNotificationService implements NotificationService{

    public void  send(String message){
        System.out.println("SMS notification send: " + message);
    }
}
