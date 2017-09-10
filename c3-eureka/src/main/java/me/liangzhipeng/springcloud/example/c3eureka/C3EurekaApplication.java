package me.liangzhipeng.springcloud.example.c3eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class C3EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(C3EurekaApplication.class, args);
	}
}
