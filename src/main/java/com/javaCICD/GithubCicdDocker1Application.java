package com.javaCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdDocker1Application {
	@GetMapping("/welcom")
	public String welcomeTo(){
			return "Welcome To Github CICD";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubCicdDocker1Application.class, args);
	}

}
