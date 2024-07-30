package com.example.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

//    @OneToMany(mappedBy = "product")
//    @JsonIgnore
//    private List<OrderProduct> orderProducts;

    private String description;

    public Product() {
    }

//    public void setOrderProducts(List<OrderProduct> orderProducts) {
//        this.orderProducts = orderProducts;
//        orderProducts.forEach(op -> op.setProduct(this));
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public OrderProduct getOrderProduct() {
//        return orderProduct;
//    }

//    public void setOrderProduct(OrderProduct orderProduct) {
//        this.orderProduct = orderProduct;
//    }
}
