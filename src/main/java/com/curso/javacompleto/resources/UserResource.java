package com.curso.javacompleto.resources;

import com.curso.javacompleto.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "joao", "99998888", "joao123", "joao@gmail.com");
        return ResponseEntity.ok().body(user);
    }
}
