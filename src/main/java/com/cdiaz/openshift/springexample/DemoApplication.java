package com.cdiaz.openshift.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String welcome(){
		return "Welcome to Cdiaz Zone";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input){
		return "Hi "+input+". Your application deployed successfully...";
	}

}
