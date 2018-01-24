package com.jinhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController2 {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}