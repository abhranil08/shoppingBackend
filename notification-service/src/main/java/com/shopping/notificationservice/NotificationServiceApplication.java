package com.shopping.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic")
	public void handleNotification( OrderPlacedEvent OrderPlacedEvent)
	{
		log.info("Received Notification for Order {}", orderPlacedEvent.getOrderNumber())
	}
}
