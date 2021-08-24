package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller //without this notation we cant acsess this rout
public class Capitalize {
    @GetMapping ("/capitalize/{AnyCase}")

    public String Capitalize(@PathVariable String AnyCase , Model model) {
        String newUpperCase = AnyCase.toUpperCase();
        model.addAttribute("capitalizedText",newUpperCase);
        return  "Capitalize.html";
    }
}
