package com.example.codeboardaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/getName")
    public String getName(){
        return "Prashant is java Dev";
    }

}
