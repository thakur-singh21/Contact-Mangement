package com.raj.cm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.raj.*")
public class ContactManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagementApplication.class, args);
	}

}
