package com.fingeso.fila_virtual.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.File;

@Document
public class Local {

    @Id
    private String Id;
    private String name;
    private String address;
    private String telephone;
    private String description;
    private File image;
    private Queue queue;

    public Local(String name, String address, String telephone, String description, File image, Queue queue) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.description = description;
        this.image = image;
        this.queue = queue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void registerLocal() {
    }
}
