package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Order;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.srvice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllOrders() {
        return productService.getAllProducts();
    }
    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable long productId) {
       return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public void createNewProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
}
