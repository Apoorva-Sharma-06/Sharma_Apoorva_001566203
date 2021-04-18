/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import Users.Customer;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public abstract class Plot {
    private int id;
    private String name;
    private double size;
    private String location;
    private double cost;
    private Customer owner;

    public Plot(int id, String name, double size, String location, double cost, Customer cust) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.location = location;
        this.cost = cost;
        this.owner = cust;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
}
