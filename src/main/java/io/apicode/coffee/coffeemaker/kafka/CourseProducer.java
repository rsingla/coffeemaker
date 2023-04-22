package io.apicode.coffee.coffeemaker.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CourseProducer {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public CourseProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
	}

}
