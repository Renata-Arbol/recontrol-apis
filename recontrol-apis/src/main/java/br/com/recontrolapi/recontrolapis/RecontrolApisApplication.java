package br.com.recontrolapi.recontrolapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class RecontrolApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecontrolApisApplication.class, args);
	}

}
