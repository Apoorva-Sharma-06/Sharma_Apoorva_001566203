/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_CAVerification;


import Dept_LegalVerification.*;
import Email.Email;
import Plots.Property;
import Plots.PropertyDirectory;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class CAVerificationDirectory {
    ArrayList<CAVerification> verificationList;
    PropertyDirectory pd;

    public CAVerificationDirectory(PropertyDirectory pd) {
        this.verificationList = new ArrayList<>();
        this.pd = pd;
    }
    
    public void addPropertyForVerification(Property p){
        verificationList.add(new CAVerification(p));
    }

    public ArrayList<CAVerification> getVerificationList() {
        return verificationList;
    }
    
    public void verifyProperty(CAVerification p, int result){
        if(result == 0){
            //Send email to buyer that docs not verified
            Email mailSender = new Email();
            mailSender.sendEmail(p.p.getBuyer().getEmail(), "Payment processing failed", "You do not have adequate funds!");
            p.p.setBuyer(null);
            p.p.setBuyerDocs(null);
            p.p.setBuyerInterested(0);
        }
        else{
           //Send email to seller and buyer that property sold 
           Email mailSender = new Email();
           mailSender.sendEmail(p.p.getBuyer().getEmail(), "Congratulations! Your payment was successful", "You have bought a new Property!");
           mailSender.sendEmail(p.p.getSeller().getEmail(), "Congratulations! Your property was sold", "You have sold one of your Properties!");
           pd.getPropertyList().remove(p.p);
        }
        verificationList.remove(p);
    }
    
    
}
