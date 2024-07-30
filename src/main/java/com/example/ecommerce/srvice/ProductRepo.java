package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductRepo extends JpaRepositoryImplementation<Product, Long> {
}
