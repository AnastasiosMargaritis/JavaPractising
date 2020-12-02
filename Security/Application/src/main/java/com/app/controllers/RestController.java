package com.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/tutorial")
public class RestController {

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello Authenticated World", HttpStatus.OK);
    }
}
