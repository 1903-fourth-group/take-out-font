package com.hellojava.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("index")
    @ApiOperation("测试")
    public void loadAll(){
        System.out.println(11111);
    }
}
