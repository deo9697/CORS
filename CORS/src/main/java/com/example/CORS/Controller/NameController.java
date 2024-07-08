package com.example.CORS.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
@CrossOrigin(origins = "hello")
public class NameController {

    @GetMapping
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
