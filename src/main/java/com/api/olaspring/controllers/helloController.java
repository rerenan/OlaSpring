package com.api.olaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class helloController {
    @GetMapping("/")
    public String HelloSpring() {
        return "Olá Spring";
    }
}
