package com.fingeso.fila_virtual.models;

import java.util.ArrayList;

public class Owner  extends User{
    private ArrayList<Local> LocalList;

    public ArrayList<Local> getLocalList() {
        return LocalList;
    }

    public void setLocalList(ArrayList<Local> localList) {
        LocalList = localList;
    }
}
