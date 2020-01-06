package cn.it.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration   // 声明自动配置
@ComponentScan

public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);


    }
}
