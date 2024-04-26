package com.aprendendojava.course.services;

import com.aprendendojava.course.entities.Order;
import com.aprendendojava.course.entities.User;
import com.aprendendojava.course.repositories.OrderRepository;
import com.aprendendojava.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

}
