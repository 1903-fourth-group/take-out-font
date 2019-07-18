package com.hellojava.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "business_type")
public class BusinessType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_type_id")
    private int typeId;
    @Column(name = "bus_type_food")
    private String food;
    @Column(name = "bus_type_dessdrink")
    private String dessDrink;
    @Column(name = "bus_type_market")
    private String market;
    @Column(name = "bus_type_vegfruit")
    private String vegFruit;
    @Column(name = "bus_type_medicine")
    private String medicine;

}
