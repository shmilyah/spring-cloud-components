package com.geny.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-demo-service")
public interface SpringDemoFeignService {

    @RequestMapping(value = "port", method = RequestMethod.GET)
    String hello();
}
