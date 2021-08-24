package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping ("/")  //home rout
    @ResponseBody   //allow to show result on localhost
    public String GetHome(){
        return "Hello Word";
    }
}
