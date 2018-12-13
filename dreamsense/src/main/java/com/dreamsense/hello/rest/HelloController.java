package com.dreamsense.hello.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public ResponseEntity info() {
      return new ResponseEntity<String>("This is an info section", HttpStatus.OK); 
    }

}