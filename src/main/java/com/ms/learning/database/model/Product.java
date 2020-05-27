package com.ms.learning.database.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String desc;

    @Column(name="BRAND")
    private String brand;

    @Column(name="PRICE")
    private double price;

    @Column(name="QUANTITY")
    private int quantity;

}
