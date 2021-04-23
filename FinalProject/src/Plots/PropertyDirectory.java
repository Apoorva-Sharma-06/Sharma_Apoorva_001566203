/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import Dept_LegalVerification.LegalVerificationDirectory;
import Dept_PhysicalVerification.PhysicalVerificationDirectory;
import Dept_Presenters.PresentPropertyDirectory;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class PropertyDirectory {
    private ArrayList<Property> propertyList;
    PhysicalVerificationDirectory pvd;
    PresentPropertyDirectory pp;
    LegalVerificationDirectory lv;
    
    private ArrayList<Agriculture> agricultureList;
    private ArrayList<Commercial> commercialList;
    private ArrayList<Residential> residentialList;
    
    public PropertyDirectory(){
        propertyList = new ArrayList<>();
        pvd = new PhysicalVerificationDirectory(this);
        pp = new PresentPropertyDirectory();
        lv = new LegalVerificationDirectory(this);
        
        agricultureList = new ArrayList<>();
        commercialList = new ArrayList<>();
        residentialList = new ArrayList<>();
    }
    
    public void addProperty(int ptype, String area, String neighbourhood, String city, String state, String zip, double size, double cost, int btype, int advOpt, User seller, String sellerDocs){
        Property p = new Property(ptype, area, neighbourhood, city, state, zip, size, cost, btype, advOpt, seller, sellerDocs);
        propertyList.add(p);
        pvd.addPropertyForVerification(p, seller);
        
        agricultureList.add((Agriculture) p);
        commercialList.add((Commercial) p);
        residentialList.add((Residential) p);
    }
    
    public ArrayList<Property> getPropertyList(int ptype, String area, String neighbourhood, String city, String state, int btype){
        ArrayList<Property> templist = new ArrayList<>();
        for(int i=0; i<propertyList.size(); i++){
            if(propertyList.get(i).getPtype() == ptype &&
                    propertyList.get(i).getBtype() == btype &&
                    propertyList.get(i).getIsPhysicalVerificationPending() == 0 &&
                    propertyList.get(i).getBuyerInterested() == 0 &&
                    propertyList.get(i).getArea().equals(area) &&
                    propertyList.get(i).getCity().equals(city) &&
                    propertyList.get(i).getState().equals(state) &&
                    propertyList.get(i).getNeighbourhood().equals(neighbourhood)
                    ){
                templist.add(propertyList.get(i));
            }
        }
        return templist;
    }
    
    public void showInterest(Property p, User buyer, String buyerdocs){
        p.setBuyer(buyer);
        p.setBuyerDocs(buyerdocs);
        p.setBuyerInterested(1); 
        lv.addPropertyForVerification(p);
    }
    
    public void optForPresenter(Property p, User buyer){
        pp.addPropertyForPresentation(p, buyer);
    }
    
    public ArrayList<Property> getPropertyListForDigitalAdvertising(){
        ArrayList<Property> templist = new ArrayList<>();
        for(int i=0; i<templist.size(); i++){
            if(propertyList.get(i).getAdvOpt() == 1 && propertyList.get(i).getIsPhysicalVerificationPending() == 0 && propertyList.get(i).getBuyerInterested() == 0 && propertyList.get(i).getAf()==null){
                templist.add(propertyList.get(i));
            }
        }
        return templist;
    }
    
    public ArrayList<Property> getPropertyListForPhysicalAdvertising(){
        ArrayList<Property> templist = new ArrayList<>();
        for(int i=0; i<templist.size(); i++){
            if(propertyList.get(i).getAdvOpt() == 2 && propertyList.get(i).getIsPhysicalVerificationPending() == 0 && propertyList.get(i).getBuyerInterested() == 0){
                templist.add(propertyList.get(i));
            }
        }
        return templist;
    }
    
    public ArrayList<Property> getPropertyList(){
        return this.propertyList;
    }
}
