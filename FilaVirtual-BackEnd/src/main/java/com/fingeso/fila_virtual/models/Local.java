package com.fingeso.fila_virtual.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.File;

@Document
public class Local {
    public String name;
    public  String address;
    public String telephone;
    public String description;
    public File image;
    public Queue queue;
    public void registerLocal() {
    }
}
