package com.micro.order.service.Repository;

import com.micro.order.service.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // You can define additional custom query methods here if needed
}