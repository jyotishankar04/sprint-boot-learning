package com.qwikish.suvam.module1intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introApplication {

	public static void main(String[] args) {
		SpringApplication.run(Module1introApplication.class, args);
		PaymentService paymentServiceObj = new PaymentService();
		paymentServiceObj.pay();
	}
}
