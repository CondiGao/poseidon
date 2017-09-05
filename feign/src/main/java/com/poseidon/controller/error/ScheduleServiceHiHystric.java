package com.poseidon.controller.error;

import com.poseidon.controller.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by wenchao.gao on 2017/8/30.
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry  " + name;
    }
}
