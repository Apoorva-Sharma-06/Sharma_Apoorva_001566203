/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import Users.Customer;
import Users.User;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Commercial extends Property{
    public Commercial(int ptype, String area, String neighbourhood, String city, String state, String zip, double size, double cost, int btype, int advOpt, User seller, String sellerDocs) {
        super(ptype, area, neighbourhood, city, state, zip, size, cost, btype, advOpt, seller, sellerDocs);
    } 
}
