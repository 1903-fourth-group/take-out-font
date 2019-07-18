package com.hellojava.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "business_info")
public class Business implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private int busId;
    @Column(name = "bus_name")
    private String busName;
    @Column(name = "bus_img")
    private String busImg;
    @Column(name = "bus_grade")
    private int busGrade;
    @Column(name = "sales_per_month")
    private double salesPerMonth;
    @Column(name = "min_delivery")
    private double minDelivery;
    @Column(name = "delivery_cost_day")
    private double deliveryCostDay;
    @Column(name = "delivery_cost_night")
    private double deliveryCostNight;
    @Column(name = "consume_per_head")
    private double consumePerHead;
    private int debit;
    private double distance;


}
