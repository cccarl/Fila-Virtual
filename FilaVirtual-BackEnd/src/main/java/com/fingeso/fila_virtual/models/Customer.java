package com.fingeso.fila_virtual.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer extends User {
    @Id
    private String Id;
}
