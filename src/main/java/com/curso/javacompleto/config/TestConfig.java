package com.curso.javacompleto.config;

import com.curso.javacompleto.entities.User;
import com.curso.javacompleto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "123456", "988888888", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "123456", "977777777", "alex@gmail.com");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}