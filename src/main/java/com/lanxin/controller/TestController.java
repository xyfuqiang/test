package com.lanxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aw on 2019/1/24.
 */

@RestController   //返回Json数据用(如果返回的是 ModelAndView  还是用Controller)
@RequestMapping(value="/emp")    //处理器的通用映射前缀(窄化映射)
public class TestController {

    @RequestMapping(value="/emptest")
    public   String    test(){

        return    "你好boy";
    }
}
