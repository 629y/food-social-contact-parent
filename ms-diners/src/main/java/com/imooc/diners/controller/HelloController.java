package com.imooc.diners.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(String name){
        return "hello " + name;
    }

//    public static void main(String[] args) {
//        System.out.println(5/2);
//        System.out.println(Math.floor(4.5));
//        System.out.println(Math.ceil(4.5));
//    }
}
