package com.hellojava.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "evaluation")
public class Evaluation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eva_id")
    private int evaId;
    @Column(name = "eva_order")
    private int evaOrder;
    @Column(name = "eva_detail")
<<<<<<< .merge_file_a13620
    private int evaDetail;
    @Column(name = "eva_grade")
    private int evaGrade;
    @Column(name = "eva_img")
    private int evaImg;
=======
    private String evaDetail;
    @Column(name = "eva_grade")
    private int evaGrade;
    @Column(name = "eva_img")
    private String evaImg;
>>>>>>> .merge_file_a14760

}
