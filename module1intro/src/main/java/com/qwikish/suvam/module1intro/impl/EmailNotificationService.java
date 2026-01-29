package com.qwikish.suvam.module1intro.impl;

import com.qwikish.suvam.module1intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@ConditionalOnProperty(name= "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {
    public void send(String message){
        System.out.println("Sending Email: " + message);
    }
}
