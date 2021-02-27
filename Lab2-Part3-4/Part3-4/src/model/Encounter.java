/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Apoorva Sharma
 */
public class Encounter {
    VitalSigns vs;
    String date;

    public Encounter(VitalSigns vs, String date) {
        this.vs = vs;
        this.date = date;
    }
    
    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
