package com.exercisetracker.exercise.controllers;

import com.exercisetracker.exercise.DTOs.UserDTO;
import com.exercisetracker.exercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/exercise/newuser")
    @ResponseBody
        public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDto) {

        return new ResponseEntity<>(userService.addUser(userDto), HttpStatus.CREATED);
    }
}
