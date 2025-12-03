package com.example.Task.Tracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskTrackerApplication {

	public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        // Expose .env values to Spring Boot
        System.setProperty("POSTGRES_PASSWORD", dotenv.get("POSTGRES_PASSWORD"));
        SpringApplication.run(TaskTrackerApplication.class, args);
	}

}
