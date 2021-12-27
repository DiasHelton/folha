package com.imd.folha.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    // GET
    // POST
    // PUT
    // DELETE
    // PATCH
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";

    }
}
