package com.geny.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spring-demo-service", fallback = ErrorHystrix.class)
public interface SpringDemoFeignService {

    @RequestMapping(value = "port", method = RequestMethod.GET)
    String hello();
}
