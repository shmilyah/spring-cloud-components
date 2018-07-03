package com.geny.stream;

import com.geny.stream.message.StreamClient;
import com.geny.stream.message.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;
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

    @Autowired
    private StreamClient streamClient;

    @GetMapping("send")
    public void send() {
        User user = new User("张三", "154shmj");
        streamClient.output().send(MessageBuilder.withPayload("Hello World...").build());
//        streamClient.output().send(MessageBuilder.withPayload(user).build());
    }
}
