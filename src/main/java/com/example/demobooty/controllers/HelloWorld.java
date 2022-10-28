package com.example.demobooty.controllers;

import com.example.demobooty.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/user")
    public UserDto user(@RequestBody UserDto userDto){
        var usr = new UserDto("FROM LOVE WITH RUSSIA " + userDto.name(), userDto.age(), userDto.gender());
        return usr;
    }
}
