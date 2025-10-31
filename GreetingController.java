package com.example.demo;

import com.example.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", required = false) String name) {
        Greeting greeting = new Greeting();
        return greeting.sayHello(name);
    }
}


