package com.dreamsense.hello.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.dreamsense.hello.rest.model.Json;

import java.util.List;
import java.util.ArrayList;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public ResponseEntity info() {
      return new ResponseEntity<String>("This is an info section", HttpStatus.OK); 
    }
    
    @RequestMapping(value = "/json", produces = { "application/json"})
    public List<Json> json() {
      List<Json> jsonList = new ArrayList();
      jsonList.add(Json.of("Fred", "Jones"));
      jsonList.add(Json.of("John", "Smith"));
      
      return jsonList;
    }

}