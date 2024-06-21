package com.programming.demo.springbootdeployaws.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Value("${RDS_USERNAME}")
    String userName;
    @GetMapping
    public String get() {
        return "Hello "+ userName;
    }
}
