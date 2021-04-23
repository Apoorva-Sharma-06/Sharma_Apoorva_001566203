/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

import Dept_Adv.AdvertisingFirm;
import Users.User;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Property {
    private static int count = 1;
    int id;
    int ptype; // 0=Agri; 1=Comm; 2=Resi;
    String area;
    String neighbourhood;
    String city;
    String state;
    String zip;
    double size;
    double cost;
    int btype;
    int advOpt; //0=none 1=digital 2=actual
    AdvertisingFirm af;
    User seller;
    String sellerDocs;
    User buyer;
    String buyerDocs;
    int buyerInterested; //0=No; 1=Yes;
    int isPhysicalVerificationPending; //0=No; 1=Yes
    int isCAVerificationPending; //0=No; 1=Yes

    public Property(int ptype, String area, String neighbourhood, String city, String state, String zip, double size, double cost, int btype, int advOpt, User seller, String sellerDocs) {
        this.id = count;
        this.ptype = ptype;
        this.area = area;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.size = size;
        this.cost = cost;
        this.btype = btype;
        this.advOpt = advOpt;
        this.seller = seller;
        this.sellerDocs = sellerDocs;
        this.af = null;
        this.buyer = null;
        this.buyerDocs = null;
        this.buyerInterested = 0;
        this.isPhysicalVerificationPending = 1;
        this.isCAVerificationPending = 1;
        count++;
    }

    
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Property.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPtype() {
        return ptype;
    }

    public void setPtype(int ptype) {
        this.ptype = ptype;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getBtype() {
        return btype;
    }

    public void setBtype(int btype) {
        this.btype = btype;
    }

    public int getAdvOpt() {
        return advOpt;
    }

    public void setAdvOpt(int advOpt) {
        this.advOpt = advOpt;
    }

    public AdvertisingFirm getAf() {
        return af;
    }

    public void setAf(AdvertisingFirm af) {
        this.af = af;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public String getSellerDocs() {
        return sellerDocs;
    }

    public void setSellerDocs(String sellerDocs) {
        this.sellerDocs = sellerDocs;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public String getBuyerDocs() {
        return buyerDocs;
    }

    public void setBuyerDocs(String buyerDocs) {
        this.buyerDocs = buyerDocs;
    }

    public int getBuyerInterested() {
        return buyerInterested;
    }

    public void setBuyerInterested(int buyerInterested) {
        this.buyerInterested = buyerInterested;
    }

    public int getIsPhysicalVerificationPending() {
        return isPhysicalVerificationPending;
    }

    public void setIsPhysicalVerificationPending(int isPhysicalVerificationPending) {
        this.isPhysicalVerificationPending = isPhysicalVerificationPending;
    }

    public int getInCAVerificationPending() {
        return isCAVerificationPending;
    }

    public void setInCAVerificationPending(int inCAVerificationPending) {
        this.isCAVerificationPending = inCAVerificationPending;
    }
    
    
    
    
}
