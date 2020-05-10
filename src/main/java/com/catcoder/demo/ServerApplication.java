package com.catcoder.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(ServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);

    }

}
