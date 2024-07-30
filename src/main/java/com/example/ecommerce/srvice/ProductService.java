package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.Order;
import com.example.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public void createProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(long id) {
        return productRepo.findById(id).get();
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }
}
