/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_Presenters;

import Email.Email;
import Plots.Property;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class PresentPropertyDirectory {
    ArrayList<PresentProperty> presentationList;

    public PresentPropertyDirectory() {
        this.presentationList = new ArrayList<>();
    }
    
    public void addPropertyForPresentation(Property p, User b){
        presentationList.add(new PresentProperty(p, b));
    }

    public ArrayList<PresentProperty> getPresentationList() {
        return presentationList;
    }
    
    public void presentPropertyDone(PresentProperty p){
        presentationList.remove(p);
        Email mailSender = new Email();
        mailSender.sendEmail(p.b.getEmail(), "Presentation complete", "Please schedule more presentation appointments on our app!");
    }
    
    
}
