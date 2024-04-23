package com.curso.javacompleto.repositories;

import com.curso.javacompleto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
