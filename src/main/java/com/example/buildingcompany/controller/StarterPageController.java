package com.example.buildingcompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StarterPageController {
    @GetMapping("/index")
    public String showAssortment() {
        return "index";
    }
}
