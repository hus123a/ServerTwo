package com.catcoder.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: demo
 * @description: mq的接受类
 * @author: CodeCat
 * @create: 2020-05-10 21:29
 **/
@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }
}

