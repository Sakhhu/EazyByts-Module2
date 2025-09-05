package com.shital.stocktrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.stocktrading.repository")
@EntityScan(basePackages = "com.stocktrading.model")

@SpringBootApplication(scanBasePackages = {"com.shital.stocktrading", "com.stocktrading"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
