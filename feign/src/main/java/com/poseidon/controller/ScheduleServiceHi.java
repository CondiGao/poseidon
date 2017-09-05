package com.poseidon.controller;

import com.poseidon.controller.error.ScheduleServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wenchao.gao on 2017/8/30.
 */

@FeignClient(value = "user",fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
