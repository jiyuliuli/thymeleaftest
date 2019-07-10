package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resources;

@Controller
public class DemoController {


    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "zhao");
        return "index";
    }


}
