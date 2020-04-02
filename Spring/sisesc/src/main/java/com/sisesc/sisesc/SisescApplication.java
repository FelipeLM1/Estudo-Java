package com.sisesc.sisesc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SisescApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisescApplication.class, args);
	//	System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
