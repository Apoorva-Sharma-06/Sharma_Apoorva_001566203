/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_Adv;

import Plots.*;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class AdvertisingFirm {
    String name;
    String type;
    ArrayList<Property> propertyList;

    public AdvertisingFirm(String name, String type) {
        this.name = name;
        this.type = type;
        propertyList = new ArrayList<>();
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void assignPropertyToFirm(Property p){
        propertyList.add(p);
    }    
    
    public void removePropertyFromFirm(Property p){
        propertyList.remove(p);
    }
    
}
