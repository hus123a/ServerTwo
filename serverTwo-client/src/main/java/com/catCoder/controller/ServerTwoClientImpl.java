package com.catCoder.controller;

import com.catCoder.api.ServerTwoClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: catCoder-parent
 * @description: fegin调用类
 * @author: CodeCat
 * @create: 2020-06-26 21:47
 **/
@RestController
public class ServerTwoClientImpl implements ServerTwoClient {
    @Override
    public String sayHello() {
        return "Hello, 这是serverTwo fegin";
    }
}

