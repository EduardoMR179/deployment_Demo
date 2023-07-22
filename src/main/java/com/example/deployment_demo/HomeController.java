package com.example.deployment_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping({"/", "/home"})
    public String getStatus(){
       return "Hola Mundo! Esto es una app de deploy";
    }
}
