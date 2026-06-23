package com.example.loose;

public class EmailNotificationService implements NotificationService {
    public void send(String message){
        System.out.println("Email notification send: " + message);
    }
}
