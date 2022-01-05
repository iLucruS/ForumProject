package com.vladforum.vladproject.controller;


import com.vladforum.vladproject.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public  ResponseEntity registration(@RequestBody UserEntity user){
        try{
            return ResponseEntity.ok("Server is worked");
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Server is denied");
        }
    }

    @GetMapping()
    public ResponseEntity getUsers(){
        try{
            return ResponseEntity.ok("Server is worked");
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Server is denied");
        }
    }
}
