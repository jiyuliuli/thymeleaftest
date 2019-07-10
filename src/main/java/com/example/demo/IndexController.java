package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/demo")

    public String demo(ModelMap map) {
        map.addAttribute("demo", "male");
        return "demo";

    }








}
