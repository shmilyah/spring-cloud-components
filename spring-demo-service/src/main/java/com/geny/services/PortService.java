package com.geny.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortService {

    @Value("${server.port}")
    String port;

    @RequestMapping("port")
    public String getPort() {
        return "Hello World, I'm from port : " + port;
    }
}
