/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Apoorva Sharma
 */
public class OurSystem {
    HashMap<String, Patient> patientDirectory;

    public OurSystem() {
        patientDirectory = new HashMap<>();
    }
    
    public Patient getPatient(String name){
        if(patientDirectory.containsKey(name)){
            return patientDirectory.get(name);
        }
        else {
            Patient p = new Patient(name);
            patientDirectory.put(name, p);
            return p;
        }
    }
    
    public void printPatientDirectory(){
        if(patientDirectory.isEmpty()){
            System.out.println("Enpty Directory!");
            return;
        }
        
        System.out.println("-----------Patient Directory-----------");
        for (Map.Entry<String, Patient> entry : patientDirectory.entrySet()) {
            String name = entry.getKey();
            System.out.println(name);
        }
        System.out.println("------------------End------------------");
    }
    
    
}
