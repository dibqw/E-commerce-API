package com.example.ecommerce.srvice;

import com.example.ecommerce.dto.OrderProductDTO;
import com.example.ecommerce.entity.Order;
import com.example.ecommerce.entity.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    OrderProductRepo orderProductRepo;
    @Autowired
    ProductRepo productRepo;
    public void createOrder() {
        //order.setDateCreated(LocalDate.now());
        orderRepo.save(new Order());
    }
    public void createOrder(List<OrderProductDTO> products) {
        //order.setDateCreated(LocalDate.now());
        List<OrderProduct> orderProducts = new ArrayList<>();
        for (OrderProductDTO dto:products) {
            OrderProduct op = new OrderProduct();
            op.setProduct(productRepo.findById(dto.getProductId()).get());
            op.setQuantity(dto.getQuantity());
            orderProducts.add(op);
        }
        orderProductRepo.saveAll(orderProducts);
        orderRepo.save(new Order(orderProducts));
    }
    public void addProductToOrder(long orderId, long orderProductId) {
        Order order = getOrderById(orderId);
        order.addProduct(orderProductRepo.getReferenceById(orderProductId));
        orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order getOrderById(long id) {
        return orderRepo.findById(id).get();
    }

    public void updateOrder(Order order) {
        orderRepo.save(order);
    }
}
