package com.geny.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringDemoRibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "portFallback")
    public String port() {
        return restTemplate.getForObject("http://SPRING-DEMO-SERVICE/port", String.class);
    }

    public String portFallback() {
        return "sorry ribbon, it's error!";
    }
}
