package com.qwikish.suvam.module1intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService(){
//        More logic you can define
        return new PaymentService();
    }

}
