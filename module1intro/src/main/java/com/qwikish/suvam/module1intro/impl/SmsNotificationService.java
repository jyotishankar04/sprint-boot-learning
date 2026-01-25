package com.qwikish.suvam.module1intro.impl;

import com.qwikish.suvam.module1intro.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending sms: " + message);
    }
}
