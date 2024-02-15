package com.verizon.waleed.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@RequestMapping("api")
public class DemoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootApplication.class, args);
	}
	
//	@RequestMapping("/greeting")
//	String getGreeting() {
//		return "Hello, howdy?";
//	}
//	
//	@RequestMapping("/greetingInTamil")
//	String getGreetingInTamil() {
//		return "Vanakam, Epdi Irukinga?";
//	}

}
