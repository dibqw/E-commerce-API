package com.example.ecommerce.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ordersTable")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    @JoinColumn(name = "orderId")
    private List<OrderProduct> products;

    public Order() {
        products = new ArrayList<>();
    }
    public Order(List<OrderProduct> products) {
        this.products = products;
    }
    public void addProduct(OrderProduct product) {
        this.products.add(product);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }
}
