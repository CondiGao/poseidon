package com.posidon.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenchao.gao on 2017/8/30.
 */
@RestController
public class HelloUserController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String applicationName;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port + ",com.poseidon.service by " + applicationName;
    }
}
