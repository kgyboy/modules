package com.rrww.dubboconsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rrww.dubboapi.Inte.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    HelloService helloService;

    @GetMapping("/ss")
    public String getmm(){
        return helloService.sayHello();
    }
}
