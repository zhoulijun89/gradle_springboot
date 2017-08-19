package com.pijun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/************************
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/world")
    @ResponseBody
    public String HelloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","这是一个ftl模板~");
        return "hello";
    }
}
