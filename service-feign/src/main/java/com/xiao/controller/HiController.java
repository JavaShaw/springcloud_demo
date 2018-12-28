package com.xiao.controller;

import com.xiao.clients.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

    @RequestMapping("/ddd")
    public String demo(){
        return "123";
    }
}
