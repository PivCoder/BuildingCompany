package com.example.buildingcompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TypeOfAssortmentController {
    @GetMapping("/typeOfAssortment")
    public String showTypeOfAssortment(){
        return "typeOfAssortment";
    }

}
