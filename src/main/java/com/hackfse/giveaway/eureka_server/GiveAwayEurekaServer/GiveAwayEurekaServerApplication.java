package com.hackfse.giveaway.eureka_server.GiveAwayEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GiveAwayEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiveAwayEurekaServerApplication.class, args);
	}

}
