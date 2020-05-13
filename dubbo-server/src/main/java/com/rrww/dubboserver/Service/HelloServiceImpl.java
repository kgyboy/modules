package com.rrww.dubboserver.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.rrww.dubboapi.Inte.HelloService;
//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
//        log.debug("调用服务");
        return "hello dubbo";
    }
}
