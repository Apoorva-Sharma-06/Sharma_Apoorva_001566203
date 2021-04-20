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
public class Commercial extends Plot{
    private static int count = 1;
    public Commercial(String name, double size, String location, double cost, Customer c,
                        String city, String state, int advertiseOption, int buyOrRent) {
        super(count, name, size, location, cost, c, city, state, advertiseOption, buyOrRent);
        count++;
    } 
}
