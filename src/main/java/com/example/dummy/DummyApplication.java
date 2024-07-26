package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DummyApplication {
	@GetMapping("/message")
	public String message(){
		return "hiiiii";
	}

	public static void main(String[] args) {
		SpringApplication.run(DummyApplication.class, args);
	}

}
