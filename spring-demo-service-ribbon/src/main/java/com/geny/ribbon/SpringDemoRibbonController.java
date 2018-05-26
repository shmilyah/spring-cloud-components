package com.geny.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoRibbonController {

    @Autowired
    SpringDemoRibbonService springDemoRibbonService;

    @RequestMapping("hello")
    public String port() {
        return springDemoRibbonService.port();
    }
}
