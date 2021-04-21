/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import Dept_Adv.AdvertisingFirm;
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
    private String city; 
    private String state; 
    private int advertiseOption;//0 = None 1=Digital 2=Physical
    private int buyOrRent;//0 = Buy 1 = Rent
    private AdvertisingFirm af;

    
    
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
        this.af = null;
    }

    
    
    public int getBuyOrRent() {
        return buyOrRent;
    }

    public void setBuyOrRent(int buyOrRent) {
        this.buyOrRent = buyOrRent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AdvertisingFirm getAf() {
        return af;
    }

    public void setAf(AdvertisingFirm af) {
        this.af = af;
    }
    
    
    
    public void setAdvFirm(AdvertisingFirm af){
        this.af = af;
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
