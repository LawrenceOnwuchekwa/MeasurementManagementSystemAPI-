package com.example.tailor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.example.tailor"})
public class TailorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TailorApplication.class, args);
	}

}
