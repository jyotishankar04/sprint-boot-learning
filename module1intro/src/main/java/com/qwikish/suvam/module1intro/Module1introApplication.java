package com.qwikish.suvam.module1intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introApplication implements CommandLineRunner {

//For these both the obejct is same
	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentService paymentService1;

	public static void main(String[] args) {
		SpringApplication.run(Module1introApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(paymentService.hashCode());
		System.out.println(paymentService1.hashCode());

		paymentService.pay();
		paymentService1.pay();
	}
}
