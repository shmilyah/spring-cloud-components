package com.geny.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author shmilyahu
 * @date 2018/7/2 23:52
 */
@SpringBootApplication
@RestController
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class,args);
    }

    @GetMapping("send")
    public void send() {
        String message = "now " + new Date();
    }
}
