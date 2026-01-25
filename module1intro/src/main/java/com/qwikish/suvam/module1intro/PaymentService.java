package com.qwikish.suvam.module1intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("Payinng.....");
    }
    @PostConstruct
    public void afterInit(){
        System.out.println("Before paying");
    }
    @PreDestroy
    public void beforeInit(){
        System.out.println("After payment is done");
    }

}
