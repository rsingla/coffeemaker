package io.apicode.coffee.coffeemaker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CoffeeController {

    @GetMapping("/coffee")
    public String getCoffee() {
        return "Coffee";
    }
    
    @GetMapping("/")
    public String healthCheck() {
        return "HealthCheck";
    }
    
    
    
}
