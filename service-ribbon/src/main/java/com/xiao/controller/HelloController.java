package com.xiao.controller;

import com.xiao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(@RequestParam String name){
        return helloService.getService(name);
    }

    @RequestMapping("demo")
    @ResponseBody
    public String demo(){
        return "12333";
    }

}
