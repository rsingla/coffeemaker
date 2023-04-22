package io.apicode.coffee.coffeemaker;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.Uuid;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

import io.apicode.coffee.coffeemaker.kafka.CourseProducer;
import io.apicode.coffee.coffeemaker.model.Course;
import net.datafaker.Faker;

@SpringBootApplication
@EnableKafka
public class CoffeemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeemakerApplication.class, args);
	}

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("course-topic").partitions(3).replicas(1).build();
	}

	@Bean
	public ApplicationRunner runner(CourseProducer courseProducer) {
		return args -> {
			while (true) {
				
				Faker fake = new Faker();
				Course course = new Course();
				course.setId(Uuid.randomUuid().toString());
				course.setName(fake.funnyName().name());
				course.setCourseLengthInMonth(fake.random().nextInt());
				
				courseProducer.sendMessage("course-topic", course.toString() );

				Thread.sleep(3000L);
			}
		};
	}

}
