package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private double money;

}
