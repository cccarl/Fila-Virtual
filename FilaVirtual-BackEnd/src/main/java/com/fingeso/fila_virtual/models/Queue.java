package com.fingeso.fila_virtual.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Document
public class Queue{
    private ArrayList<Customer> customerList;
    @Id
    private String Id;
    private String primary;
    private String enabled;
    private String estimatedTime;

    public Queue(String primary,String enabled,String estimatedTime){
        this.primary = primary;
        this.enabled=enabled;
        this.estimatedTime = estimatedTime;
        this.customerList = new ArrayList<>();
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /*
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }*/

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
