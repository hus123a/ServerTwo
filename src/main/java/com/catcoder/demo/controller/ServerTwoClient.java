package com.catcoder.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "rabbitmq-consumer")
public interface ServerTwoClient {

    @GetMapping("/sayHello2")
    public String sayHello();
}
