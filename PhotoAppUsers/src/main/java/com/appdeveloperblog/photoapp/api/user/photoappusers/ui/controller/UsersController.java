package com.appdeveloperblog.photoapp.api.user.photoappusers.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status")
    public String status() {
        return "API is up and running!";
    }
}
