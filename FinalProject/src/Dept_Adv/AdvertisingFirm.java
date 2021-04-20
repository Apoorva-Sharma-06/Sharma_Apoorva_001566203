/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_Adv;

import Plots.Plot;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class AdvertisingFirm {
    String name;
    String type;
    ArrayList<Plot> plotList;

    public AdvertisingFirm(String name, String type) {
        this.name = name;
        this.type = type;
        plotList = new ArrayList<>();
    }

    public ArrayList<Plot> getPlotList() {
        return plotList;
    }

    public void assignPlotToFirm(Plot p){
        plotList.add(p);
    }    
    
    public void removePlotFromFirm(Plot p){
        plotList.remove(p);
    }
    
}
