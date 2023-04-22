package io.apicode.coffee.coffeemaker.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CourseConsumer {

	@KafkaListener(id = "course-consumer", topics = "course-topic")
	public void listen(@Payload String payload) {
		System.out.println("Recieved New Event " + payload);
	}
	
}
