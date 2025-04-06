package com.appsdeveloperblog.photoapp.api.account.photoapiaccountmanager.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/status/check")
    public String getStatus() {
        return "Server is up and running";
    }
}
