package com.example.tema_10.repository;

import com.example.tema_10.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findAllByUserId(Long userId);
}
