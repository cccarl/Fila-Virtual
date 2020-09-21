package com.fingeso.fila_virtual.models;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer extends User {

    public Customer(String rut, String names, String surnames, String email, String password, String phoneNum, String role) {
        super(rut, names, surnames, email, password, phoneNum, role);
    }
}
