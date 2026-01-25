package com.qwikish.suvam.module1intro.impl;

import com.qwikish.suvam.module1intro.NotificationService;

public class EmailNotificationService implements NotificationService {
    public void send(String message){
        System.out.println("Sending Email: " + message);
    }
}
