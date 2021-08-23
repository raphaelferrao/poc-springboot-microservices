package com.example.order.ms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Orderr {

    @Id
    @GeneratedValue
    private int id;

    private Integer productId;

    private Date date;

    private Integer quantity;

}