package ua.lviv.iot.animalshop.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.animalshop.rest.dataaccess", 
				 "ua.lviv.iot.animalshop.rest.bussiness",
				 "ua.lviv.iot.animalshop.rest.controller",
			})

@EnableJpaRepositories({ "ua.lviv.iot.animalshop.rest.dataaccess" })
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}