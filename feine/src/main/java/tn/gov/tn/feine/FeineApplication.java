package tn.gov.tn.feine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeineApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeineApplication.class, args);
	}

}
/*
 * creer une classe :
    
    import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a")
public interface ServiceAClient {

    @GetMapping("/greet")
    String greet();
}




package com.example.service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class ServiceBApplication {
    private final ServiceAClient serviceAClient;

    public ServiceBApplication(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }
    @GetMapping("/greet-from-b")
    public String greetFromB() {
        return "Service B says: " + serviceAClient.greet();
    }

}

 */