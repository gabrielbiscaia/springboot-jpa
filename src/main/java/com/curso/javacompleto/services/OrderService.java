package com.curso.javacompleto.services;

import com.curso.javacompleto.entities.Order;
import com.curso.javacompleto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> object = orderRepository.findById(id);
        return object.get();
    }
}
