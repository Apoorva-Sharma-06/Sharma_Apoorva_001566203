/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dept_LegalVerification;


import Dept_CAVerification.CAVerificationDirectory;
import Email.Email;
import Plots.Property;
import Plots.PropertyDirectory;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class LegalVerificationDirectory {
    ArrayList<LegalVerification> verificationList;
    CAVerificationDirectory cd;
    PropertyDirectory pd;

    public LegalVerificationDirectory(PropertyDirectory pd) {
        this.verificationList = new ArrayList<>();
        cd = new CAVerificationDirectory(pd);
        this.pd = pd;
    }
    
    public void addPropertyForVerification(Property p){
        verificationList.add(new LegalVerification(p));
    }

    public ArrayList<LegalVerification> getVerificationList() {
        return verificationList;
    }
    
    public void verifyProperty(LegalVerification p, int result){
        if(result == 0){
            //Send email to buyer that docs not verified
            Email mailSender = new Email();
            mailSender.sendEmail(p.p.getBuyer().getEmail(), "Document Verification failed", "Please upload proper documents!");
            p.p.setBuyer(null);
            p.p.setBuyerDocs(null);
            p.p.setBuyerInterested(0);
        }
        else {
            Email mailSender = new Email();
            mailSender.sendEmail(p.p.getBuyer().getEmail(), "Document Verification successful", "Please wait while we process the paper work!");
            p.p.setInCAVerificationPending(1);
            cd.addPropertyForVerification(p.p);
        }
        verificationList.remove(p);
    }
    
    
}
