package com.prac.springbootshoppingprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@PropertySource("classpath:env.yml")
public class SpringBootShoppingPracApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootShoppingPracApplication.class, args);
    }

}
