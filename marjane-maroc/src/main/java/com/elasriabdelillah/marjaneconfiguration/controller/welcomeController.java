package com.elasriabdelillah.marjaneconfiguration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @RequestMapping("/hello")
    public String welcome(){
        return "welcome";
    }
}
