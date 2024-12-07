package tn.gov.sibtel.slaheddine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SlaheddineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlaheddineApplication.class, args);

	}

	@GetMapping("/greet")
    public String greet() {
        return "Hello from Service slah";
    }
}
