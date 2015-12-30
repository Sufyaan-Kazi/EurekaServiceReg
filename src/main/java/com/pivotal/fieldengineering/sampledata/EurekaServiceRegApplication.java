package com.pivotal.fieldengineering.sampledata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(EurekaServiceRegApplication.class).web(true).run(args);
		SpringApplication.run(EurekaServiceRegApplication.class, args);
	}
}
