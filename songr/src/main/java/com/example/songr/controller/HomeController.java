package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping ("/hello")  //home rout
    @ResponseBody   //allow to show result on localhost
    public String GetHome(){
        return "hello word";
    }
}
