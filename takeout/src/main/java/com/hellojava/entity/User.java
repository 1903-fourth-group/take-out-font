package com.hellojava.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

//    头像，用户名，账号密码，手机号码，收货地址（可多条），银行卡
//   (via,usename,usepassward,phone,adress,bankcard)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String via;
    private String usePassward;
    private String phone;
    private String adress;
    private String bankCard;

}
