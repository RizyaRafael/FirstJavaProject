package com.FirstProject.FirstProject.controller;

import com.FirstProject.FirstProject.service.UserLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return null;
    };
}
