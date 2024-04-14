package com.example.buildingcompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

//TODO описать данный контроллер
@Controller
@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
public class AssortmentController {
    @GetMapping("/assortment")
    public String showAssortment() {
        return "assortment";
    }

}
