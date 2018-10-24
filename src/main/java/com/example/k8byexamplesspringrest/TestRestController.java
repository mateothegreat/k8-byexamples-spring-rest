package com.example.k8byexamplesspringrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping("/is_ready")
    public ResponseEntity<String> isReady() {

        return new ResponseEntity<>("I'm ready!", HttpStatus.OK);

    }

    @GetMapping("/is_alive")
    public ResponseEntity<String> isAlive() {

        return new ResponseEntity<>("I'm alive!", HttpStatus.OK);

    }

    @PostMapping("/echo")
    public ResponseEntity<?> testResponse(@RequestBody String body) {

        return new ResponseEntity<>("You said: " + body, HttpStatus.OK);

    }

}
