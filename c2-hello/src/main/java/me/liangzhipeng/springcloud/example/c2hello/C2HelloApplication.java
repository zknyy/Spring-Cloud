package me.liangzhipeng.springcloud.example.c2hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class C2HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(C2HelloApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
