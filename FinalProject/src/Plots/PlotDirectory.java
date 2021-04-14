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
    
    //LT cost
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
    
    //GT cost
    public ArrayList<Agriculture> getAgricultureListgtCost(double val){
        ArrayList<Agriculture> agricultureListt = new ArrayList();
        for(int i=0; i<agricultureList.size(); i++){
            if(agricultureList.get(i).getCost() >= val){
                agricultureListt.add(agricultureList.get(i));
            }
        }
        return agricultureListt;
    }
    
    public ArrayList<Commercial> getCommercialListgtCost(double val){
        ArrayList<Commercial> commercialListt = new ArrayList();
        for(int i=0; i<commercialList.size(); i++){
            if(commercialList.get(i).getCost() >= val){
                commercialListt.add(commercialList.get(i));
            }
        }
        return commercialListt;
    }
    
    public ArrayList<Residential> getResidentialListgtCost(double val){
        ArrayList<Residential> residentialListt = new ArrayList();
        for(int i=0; i<residentialList.size(); i++){
            if(residentialList.get(i).getCost() >= val){
                residentialListt.add(residentialList.get(i));
            }
        }
        return residentialListt;
    }
    
    
    //LT size
    public ArrayList<Agriculture> getAgricultureListltSize(double val){
        ArrayList<Agriculture> agricultureListt = new ArrayList();
        for(int i=0; i<agricultureList.size(); i++){
            if(agricultureList.get(i).getSize() <= val){
                agricultureListt.add(agricultureList.get(i));
            }
        }
        return agricultureListt;
    }
    
    public ArrayList<Commercial> getCommercialListltSize(double val){
        ArrayList<Commercial> commercialListt = new ArrayList();
        for(int i=0; i<commercialList.size(); i++){
            if(commercialList.get(i).getSize() <= val){
                commercialListt.add(commercialList.get(i));
            }
        }
        return commercialListt;
    }
    
    public ArrayList<Residential> getResidentialListltSize(double val){
        ArrayList<Residential> residentialListt = new ArrayList();
        for(int i=0; i<residentialList.size(); i++){
            if(residentialList.get(i).getSize() <= val){
                residentialListt.add(residentialList.get(i));
            }
        }
        return residentialListt;
    }
    
    //GT size
    public ArrayList<Agriculture> getAgricultureListgtSize(double val){
        ArrayList<Agriculture> agricultureListt = new ArrayList();
        for(int i=0; i<agricultureList.size(); i++){
            if(agricultureList.get(i).getSize() >= val){
                agricultureListt.add(agricultureList.get(i));
            }
        }
        return agricultureListt;
    }
    
    public ArrayList<Commercial> getCommercialListgtSize(double val){
        ArrayList<Commercial> commercialListt = new ArrayList();
        for(int i=0; i<commercialList.size(); i++){
            if(commercialList.get(i).getSize() >= val){
                commercialListt.add(commercialList.get(i));
            }
        }
        return commercialListt;
    }
    
    public ArrayList<Residential> getResidentialListgtSize(double val){
        ArrayList<Residential> residentialListt = new ArrayList();
        for(int i=0; i<residentialList.size(); i++){
            if(residentialList.get(i).getSize() >= val){
                residentialListt.add(residentialList.get(i));
            }
        }
        return residentialListt;
    }

    
    //Location
    public ArrayList<Agriculture> getAgricultureListLoc(String val){
        ArrayList<Agriculture> agricultureListt = new ArrayList();
        for(int i=0; i<agricultureList.size(); i++){
            if(agricultureList.get(i).getLocation().equalsIgnoreCase(val)){
                agricultureListt.add(agricultureList.get(i));
            }
        }
        return agricultureListt;
    }
    
    public ArrayList<Commercial> getCommercialListLoc(String val){
        ArrayList<Commercial> commercialListt = new ArrayList();
        for(int i=0; i<commercialList.size(); i++){
            if(commercialList.get(i).getLocation().equalsIgnoreCase(val)){
                commercialListt.add(commercialList.get(i));
            }
        }
        return commercialListt;
    }
    
    public ArrayList<Residential> getResidentialListLoc(String val){
        ArrayList<Residential> residentialListt = new ArrayList();
        for(int i=0; i<residentialList.size(); i++){
            if(residentialList.get(i).getLocation().equalsIgnoreCase(val)){
                residentialListt.add(residentialList.get(i));
            }
        }
        return residentialListt;
    }

}
