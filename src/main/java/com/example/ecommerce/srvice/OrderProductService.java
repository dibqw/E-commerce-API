package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.OrderProduct;
import com.example.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService {
    @Autowired
    private OrderProductRepo orderProductRepo;
    @Autowired
    private ProductRepo productRepo;

    public void createOrderProduct(long productId, int quantity) {
        //trow exeption no exist
        Product product = productRepo.getReferenceById(productId);
        orderProductRepo.save(new OrderProduct(product,quantity));
    }

    public List<OrderProduct> getAllOrderProducts() {
        return orderProductRepo.findAll();
    }
}
