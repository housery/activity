package com.xiaohoo.activity;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan("com.xiaohoo.*")
public class ActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityApplication.class, args);
    }

}
