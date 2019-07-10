package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController  {
@RequestMapping(value = "/cuowu")

    public String err() {
        int a = 1 / 0;
        return "cuowu";
    }
}
