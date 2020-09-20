package com.fingeso.fila_virtual.models;

import java.util.ArrayList;

public class Admin extends User {
    private ArrayList<Queue>  queueList;

    public ArrayList<Queue> getQueueList() {
        return queueList;
    }

    public void setQueueList(ArrayList<Queue> queueList) {
        this.queueList = queueList;
    }
}
