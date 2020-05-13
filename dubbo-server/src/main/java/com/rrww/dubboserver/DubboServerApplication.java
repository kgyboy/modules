package com.rrww.dubboserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DubboServerApplication {

    public static void main(String[] args) {
        log.debug("启动");
        SpringApplication.run(DubboServerApplication.class, args);
        log.info("info");
        log.error("error");
        log.debug("debug");
    }
}
