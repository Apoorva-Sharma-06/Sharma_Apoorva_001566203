/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_PhysicalVerification;

import Email.Email;
import Plots.Property;
import Plots.PropertyDirectory;
import Users.User;
import java.beans.PropertyVetoException;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class PhysicalVerificationDirectory {
    PropertyDirectory pd;
    ArrayList<PhysicalVerification> verificationList;

    public PhysicalVerificationDirectory(PropertyDirectory pd) {
        this.verificationList = new ArrayList<>();
        this.pd = pd;
    }
    
    public void addPropertyForVerification(Property p, User s){
        verificationList.add(new PhysicalVerification(p, s));
    }

    public ArrayList<PhysicalVerification> getVerificationList() {
        return verificationList;
    }
    
    public void verifyProperty(PhysicalVerification p, int result){
        p.p.setIsPhysicalVerificationPending(0);
        if(result == 0){
            //Send email that verification failed
            Email mailSender = new Email();
            mailSender.sendEmail(p.s.getEmail(), "Physical Verification failed", "Removing listing because the property inspection failed. Please use our app to re-list once you are better prepared!");
            pd.getPropertyList().remove(p.p);
        }
        else{
            //Send email that verification was successful
            Email mailSender = new Email();
            mailSender.sendEmail(p.s.getEmail(), "Physical Verification successful", "Your listing is now online!");
        }
        verificationList.remove(p);
    }
    
    
}
