package io.apicode.coffee.coffeemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "io.apicode.coffee.coffemaker")
public class CoffeemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeemakerApplication.class, args);
	}

}
