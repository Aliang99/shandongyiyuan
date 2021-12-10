package com.yiyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("t1")
    @ResponseBody
    public String test1(){
        return "hello";
    }

    @RequestMapping("index.do")
    public ModelAndView test2(){
        System.out.println("index");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
