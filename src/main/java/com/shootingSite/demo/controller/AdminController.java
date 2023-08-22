package com.shootingSite.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public String get(){
        return "GET:ADMIN";
    }

    @PostMapping
    public String post(){
        return "POST:ADMIN";
    }
    @PutMapping
    public String put(){
        return "PUT:ADMIN";
    }
    @DeleteMapping
    public String delete(){
        return "DELETE:ADMIN";
    }
}
