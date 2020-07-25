package com.sk.covid19trackerworldwide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19TrackerWorldwideApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19TrackerWorldwideApplication.class, args);
	}


}
