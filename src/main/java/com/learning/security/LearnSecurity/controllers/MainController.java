package com.learning.security.LearnSecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class MainController {
    @GetMapping("admin")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("I am admin user");
    }

    @GetMapping("normal")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("I am normal user");
    }

    @GetMapping("public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("I am public user");
    }
}
