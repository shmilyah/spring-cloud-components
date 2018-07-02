package com.geny.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shmily on 2018/7/1.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class,args);
    }


    @RequestMapping(value = "service2", method = RequestMethod.GET)
    public String service2() {
        return "Hi,I'm Service2!";
    }
}

