package com.curso.javacompleto.repositories;

import com.curso.javacompleto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
