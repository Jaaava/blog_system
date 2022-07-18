package com.oliver.blog_system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :16140
 * @description :
 * @create :2022-07-18 10:56:00
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test success";
    }
}
