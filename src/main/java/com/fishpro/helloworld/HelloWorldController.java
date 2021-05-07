package com.fishpro.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helloword示例
 * <pre>
 *     class 上方的 @RequestMapping("/hello") 表示类的路由，即类下所有方法上的路由都是在此路由下面（url）
 * </pre>
 * */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("")
    public String say(){
        return "Hello World From Kubernetes";
    }
}
