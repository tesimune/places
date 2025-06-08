package com.tesimune.places.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class AppController {
    @GetMapping()
    public String index() {
        return "index.html";
    }
}
