package com.example.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // combines @Controller and @ResponseBody which eliminated the need to annotate every request-handling method of the controller class with the @ResponseBody annotation
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	@RequestMapping("/") //maps web requests to Spring Controller methods
	public String home(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}
