package com.github.fwerther28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Startup {

	public static void main(String[] args) {
		System.setProperty("http.keepAlive", "false");
		SpringApplication.run(Startup.class, args);
	}
}
