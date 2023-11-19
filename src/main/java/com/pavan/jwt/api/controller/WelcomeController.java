package com.pavan.jwt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/")
    public String Welcome(){
        return "Welcome Pavan";
    }
}