package br.com.recontrolapi.recontrolapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RecontrolApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecontrolApisApplication.class, args);
	}
	//required the name
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld(@RequestParam String name){
		return "Hello World from Spring Boot to you "+ name +"  "+ 38;
	}
}
