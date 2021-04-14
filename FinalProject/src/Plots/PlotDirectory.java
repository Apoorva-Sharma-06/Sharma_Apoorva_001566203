/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class PlotDirectory {
    private ArrayList<Plot> plotList;
    private ArrayList<Agriculture> agricultureList;
    private ArrayList<Commercial> commercialList;
    private ArrayList<Residential> residentialList;

    public PlotDirectory() {
        plotList = new ArrayList();
        agricultureList = new ArrayList();
        commercialList = new ArrayList();
        residentialList = new ArrayList();
    }
    
    public void addPlot(String type, String name, double size, String location, double cost){
        if(type.equalsIgnoreCase("Commercial")){
            plotList.add(new Commercial(name, size, location, cost));
            commercialList.add(new Commercial(name, size, location, cost));
        }
        else if(type.equalsIgnoreCase("Agriculture")){
            plotList.add(new Agriculture(name, size, location, cost));
            agricultureList.add(new Agriculture(name, size, location, cost));
        }
        else if(type.equalsIgnoreCase("Residential")){
            plotList.add(new Residential(name, size, location, cost));
            residentialList.add(new Residential(name, size, location, cost));
        }
    }
    
    public ArrayList<Agriculture> getAgricultureList(){
        return agricultureList;
    }

    public ArrayList<Commercial> getCommercialList(){
        return commercialList;
    }
    
    public ArrayList<Residential> getResidentialList(){
        return residentialList;
    }
    
    public ArrayList<Agriculture> getAgricultureListltCost(double cost){
        ArrayList<Agriculture> agricultureListltcost = new ArrayList();
        for(int i=0; i<agricultureList.size(); i++){
            if(agricultureList.get(i).getCost() <= cost){
                agricultureListltcost.add(agricultureList.get(i));
            }
        }
        return agricultureListltcost;
    }
    
    public ArrayList<Commercial> getCommercialListltCost(double cost){
        ArrayList<Commercial> commercialListltcost = new ArrayList();
        for(int i=0; i<commercialList.size(); i++){
            if(commercialList.get(i).getCost() <= cost){
                commercialListltcost.add(commercialList.get(i));
            }
        }
        return commercialListltcost;
    }
    
    public ArrayList<Residential> getResidentialListltCost(double cost){
        ArrayList<Residential> residentialListltcost = new ArrayList();
        for(int i=0; i<residentialList.size(); i++){
            if(residentialList.get(i).getCost() <= cost){
                residentialListltcost.add(residentialList.get(i));
            }
        }
        return residentialListltcost;
    }
}
