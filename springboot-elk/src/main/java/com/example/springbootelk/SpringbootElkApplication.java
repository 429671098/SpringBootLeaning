package com.example.springbootelk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootElkApplication {
    Logger logger = LoggerFactory.getLogger(SpringbootElkApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElkApplication.class, args);
    }


    @GetMapping("test")
    public void test() {
        for (int i = 0; i < 10000; i++) {
            logger.info("000测试初始一些日志吧！---- "+ i);
        }
    }

}
