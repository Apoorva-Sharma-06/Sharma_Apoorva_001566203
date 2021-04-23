/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_PhysicalVerification;

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
            pd.getPropertyList().remove(p.p);
        }
        else{
            //Send email that verification was successful
        }
        verificationList.remove(p);
    }
    
    
}
