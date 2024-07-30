package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.OrderProduct;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface OrderProductRepo extends JpaRepositoryImplementation<OrderProduct, Long> {
}
