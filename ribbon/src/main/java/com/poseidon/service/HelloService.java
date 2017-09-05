package com.poseidon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wenchao.gao on 2017/8/30.
 */
@Service
public class HelloService {



    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://user/hello?name=" + name,String.class);
    }

    public String hiError(String name) {
        return "服务不可用！";
    }
}
