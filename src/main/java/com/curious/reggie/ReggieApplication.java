package com.curious.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j // 日志注解，lombok提供
@SpringBootApplication  // 这个注解是SpringBoot的一个模板
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
//        System.out.println("Hello, World!");
        log.info("项目启动成功...");  // info级别的日志，这里会通过日志进行一个输出，跟项目启动的日志输出很像
    }
}