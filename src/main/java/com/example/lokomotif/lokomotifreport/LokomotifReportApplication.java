package com.example.lokomotif.lokomotifreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
// @SpringBootApplication(scanBasePackages = "com.example")
// @EnableMongoRepositories(basePackages = "com.example.repository.mongodb")
// @EnableJpaRepositories(basePackages = "com.example.repository.mysql")
// @EntityScan(basePackages = { "com.example.data.entity" })
@SpringBootApplication
public class LokomotifReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(LokomotifReportApplication.class, args);
	}

}
