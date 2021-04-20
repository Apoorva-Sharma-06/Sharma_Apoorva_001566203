/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_Adv;

import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class AdvertisingFirmDirectory {
    private ArrayList<AdvertisingFirm> firmList;

    public AdvertisingFirmDirectory() {
        firmList = new ArrayList<>();
    }
    
    public void addFirm(String name, String type){
        firmList.add(new AdvertisingFirm(name, type));
    }

    public ArrayList<AdvertisingFirm> getFirmList() {
        return firmList;
    }    
}
