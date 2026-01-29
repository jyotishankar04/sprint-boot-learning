package com.qwikish.suvam.module1intro;

import com.qwikish.suvam.module1intro.impl.EmailNotificationService;
import com.qwikish.suvam.module1intro.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introApplication implements CommandLineRunner {

	private final NotificationService notificationService;

	public Module1introApplication(NotificationService notificationService){
		this.notificationService = notificationService;  // Constructor dependecy injection
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1introApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		THis is tightly coupled (hard to change email to sms dinamincally)

//		NotificationService notificationService = new SmsNotificationService();
//		notificationService.send("Hello");

		notificationService.send("Hello");


	}
}
