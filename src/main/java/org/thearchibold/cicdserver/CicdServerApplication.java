package org.thearchibold.cicdserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CicdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdServerApplication.class, args);
    }

    @PostConstruct
    public void welcomeMessage(){
        System.out.println("This shit is cool bitch ");
    }

}
