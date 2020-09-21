package com.fingeso.fila_virtual.models;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;

@Document
public class Admin extends User {

    private ArrayList<Queue>  queueList;

    public Admin(String rut, String names, String surnames, String email, String password, String phoneNum, String role) {
        super(rut, names, surnames, email, password, phoneNum, role);
        this.queueList = new ArrayList<>();
    }

    public ArrayList<Queue> getQueueList() {
        return queueList;
    }

    public void setQueueList(ArrayList<Queue> queueList) {
        this.queueList = queueList;
    }
}
