package com.curso.javacompleto.services;

import com.curso.javacompleto.entities.User;
import com.curso.javacompleto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> object = userRepository.findById(id);
        //Retorna o objeto dentro do optional "user"
        return object.get();
    }
}
