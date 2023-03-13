package com.badri.CloudDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

 @GetMapping(value = "/v1/hello")
    public ResponseEntity<String> getHelloWorld(){
     return ResponseEntity.ok("hello");
 }
}
