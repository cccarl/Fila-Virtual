package com.fingeso.fila_virtual.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Document
public class Queue{
    @Id
    private String Id;
    private ArrayList<Customer> customerList;
    private boolean enabled;
    private int estimatedTime;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer user){

    }
    public void removeCustomer(Customer user){

    }
    public void changeStatus(boolean currentStatus){

    }
    public void openQueue(){

    }
    public void closeQueue(){

    }
    public void calculateEstimatedTime(){

    }


}
