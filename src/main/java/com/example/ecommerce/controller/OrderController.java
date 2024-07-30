package com.example.ecommerce.controller;

import com.example.ecommerce.dto.OrderProductDTO;
import com.example.ecommerce.entity.Order;
import com.example.ecommerce.srvice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    @GetMapping("/orders/{orderId}")
    public void getOrder(@PathVariable long orderId) {
    }

    @PostMapping("/orders")
    public void createNewOrder() {
        orderService.createOrder();
    }

    @PostMapping("/addproduct/{orderId}/{orderProductId}")
    public void addProductToOrder(@PathVariable long orderId, @PathVariable long orderProductId) {
        orderService.addProductToOrder(orderId, orderProductId);
    }

    @PostMapping("/addproductstocard")
    public void addProductsToOrder(@RequestBody List<OrderProductDTO> products) {
        orderService.createOrder(products);
    }
}
