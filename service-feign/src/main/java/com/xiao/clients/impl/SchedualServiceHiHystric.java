package com.xiao.clients.impl;

import com.xiao.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+",服务异常停止,使用断路器";
    }
}
