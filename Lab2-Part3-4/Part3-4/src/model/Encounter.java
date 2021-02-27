/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Apoorva Sharma
 */
public class Encounter {
    VitalSigns vs;
    Date date;

    public Encounter(VitalSigns vs, Date date) {
        this.vs = vs;
        this.date = date;
    }
    
    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    
}
