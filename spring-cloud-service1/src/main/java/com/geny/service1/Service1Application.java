package com.geny.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shmily on 2018/7/1.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "service1", method = RequestMethod.GET)
    public String service1() {
        return restTemplate().getForObject("http://service2/service2", String.class);
    }
}

