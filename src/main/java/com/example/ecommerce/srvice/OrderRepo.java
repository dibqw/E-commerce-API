package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface OrderRepo extends JpaRepositoryImplementation<Order, Long> {
}
