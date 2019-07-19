package com.hellojava.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "shopping_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "order_business")
    private int orderBusiness;
    @Column(name = "current_user")
    private String currentUser;
    @Column(name = "order_address")
    private String orderAddress;
    @Column(name = "order_phone")
    private int orderPhone;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "order_time")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date order_time;
    @Column(name = "order_state")
    private double orderState;
    @Column(name = "user_id")
    private double userId;

}
