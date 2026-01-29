package com.qwikish.suvam.module1intro.impl;

import com.qwikish.suvam.module1intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending sms: " + message);
    }
}
