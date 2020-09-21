package com.fingeso.fila_virtual.models;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Owner extends User{

    private ArrayList<Local> LocalList;


    public Owner(String rut, String names, String surnames, String email, String password, String phoneNum, String role) {
        super(rut, names, surnames, email, password, phoneNum, role);
        LocalList = new ArrayList<>();
    }

    public ArrayList<Local> getLocalList() {
        return LocalList;
    }

    public void setLocalList(ArrayList<Local> localList) {
        LocalList = localList;
    }
}
