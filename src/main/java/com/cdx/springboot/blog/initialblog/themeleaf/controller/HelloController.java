package com.cdx.springboot.blog.initialblog.themeleaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: initialblog
 * @author: cdx
 * @create: 2018-11-04 20:28
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
