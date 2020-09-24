package com.fingeso.fila_virtual.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Document
public class Queue{

    @Id
    private String Id;
    private ArrayList<Customer> customerList;
    private String primary;
    private String enabled;
    private String estimatedTime;

    public Queue(String primary,String enabled,String estimatedTime){
        this.primary = primary;
        this.enabled=enabled;
        this.estimatedTime = estimatedTime;
        this.userList = new ArrayList<>();
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
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
