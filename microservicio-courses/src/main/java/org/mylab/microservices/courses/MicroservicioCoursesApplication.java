package org.mylab.microservices.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCoursesApplication.class, args);
	}

}
