package com.example.ecommerce.controller;

import com.example.ecommerce.entity.OrderProduct;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.srvice.OrderProductService;
import com.example.ecommerce.srvice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderProductController {
    @Autowired
    private OrderProductService orderProductService;

    @GetMapping("/orderproducts")
    public List<OrderProduct> getAllOrders() {
        return orderProductService.getAllOrderProducts();
    }

//    @PostMapping("/orderproducts/{productId}/{quantity}")
//    public void createNewOrderProduct(@PathVariable long productId, @PathVariable int quantity) {
//        orderProductService.createOrderProduct(productId, quantity);
//    }

    @PostMapping("/orderproducts/{productId}/{quantity}")
    public void createNewOrderProduct(@PathVariable long productId, @PathVariable int quantity) {
        orderProductService.createOrderProduct(productId, quantity);

    }
}
