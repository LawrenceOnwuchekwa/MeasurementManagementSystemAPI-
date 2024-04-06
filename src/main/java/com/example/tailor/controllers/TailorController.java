package com.example.tailor.controllers;

import com.example.tailor.data.TailorInterfaceImplement;
import com.example.tailor.data.UserRegisterImplement;
import com.example.tailor.models.SignUp;
import com.example.tailor.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/tailor")
public class TailorController {

    @Autowired
    private TailorInterfaceImplement service;

    @Autowired
    private UserRegisterImplement register;


    @GetMapping("/submit")
    public String start(){
        return "main";
    }
    @PostMapping("/signup")
    public boolean createAccount(@RequestBody SignUp sign){
        return service.createAccount(sign);
    }

    @PostMapping("/register")
    public boolean registerAccount(@RequestBody User user){
        return register.register(user);
    }


}
