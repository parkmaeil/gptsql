package com.example.dp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/sql")
    public String index(){
         return "sql";
    }
}
