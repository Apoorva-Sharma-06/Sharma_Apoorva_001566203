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
    private double size;
    private double cost;
    private Customer owner;
    private String name; //area
    private String location; //neighbourhood
    private String city; //area
    private String state; //neighbourhood
    private int advertiseOption;//0 = None 1=Digital 2=Physical
    private int buyOrRent;//0 = Buy 1 = Rent

    
    
    public Plot(int id, String name, double size, String location, double cost, Customer cust,
                        String city, String state, int advertiseOption, int buyOrRent) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.location = location;
        this.cost = cost;
        this.owner = cust;
        this.city = city;
        this.state = state;
        this.advertiseOption = advertiseOption;
        this.buyOrRent = buyOrRent;
    }

    public int getAdvertiseOption() {
        return advertiseOption;
    }

    public void setAdvertiseOption(int advertiseOption) {
        this.advertiseOption = advertiseOption;
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
