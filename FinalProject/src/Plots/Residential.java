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
public class Residential extends Plot{

    private static int count = 1;
    public Residential(String name, double size, String location, double cost, Customer c) {
        super(count, name, size, location, cost, c);
        count++;
    }  
    
}
