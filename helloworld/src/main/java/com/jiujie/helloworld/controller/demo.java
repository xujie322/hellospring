package com.jiujie.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xujie
 * @Date 9:50 上午 2021/4/14
 * @Param 2021-04-14 09:50
 **/
@RestController
public class demo {

    @RequestMapping("/hello")
    public String hello(){
        //调用业务，接受前端参数
        return "demo";
    }



}
