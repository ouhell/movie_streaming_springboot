package com.example.moviewatcher.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general")
public class GeneralController {
    @GetMapping("/hello")
    public ResponseEntity<String> hellOWorld(){
        return ResponseEntity.ok().body("Hello World");
    }
}
