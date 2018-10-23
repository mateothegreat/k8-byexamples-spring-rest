package com.example.k8byexamplesspringrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @PostMapping("/echo")
    public ResponseEntity<?> testResponse(@RequestBody String body) {

        return new ResponseEntity<>("You said: " + body, HttpStatus.OK);

    }

}
