package com.lanxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.lanxin.controller")    //扫描(不在同一个包里面就需要加这个)
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }
}

