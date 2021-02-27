/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            System.out.println("Empty Directory!");
            return;
        }
        
        System.out.println("-----------Patient Directory-----------");
        for (Map.Entry<String, Patient> entry : patientDirectory.entrySet()) {
            String name = entry.getKey();
            System.out.println(name);
        }
        System.out.println("------------------End------------------");
    }
    
    public void getCommunityInfo(String communityName) {
        if(patientDirectory.isEmpty()){
            System.out.println("Empty Directory!");
            return;
        }
        int count = 0;
        HashMap<String, Patient> commDirectory = new HashMap<>();;
        for (Map.Entry<String, Patient> entry : patientDirectory.entrySet()) {
            if(entry.getValue().address == null){
                continue;
            }
            if(entry.getValue().address.community.equalsIgnoreCase(communityName)){
                commDirectory.put(entry.getKey(), entry.getValue());
                count++;
            }
        }
        if(count == 0){
            System.out.println("No data for community "+communityName);
            return;
        }
        int a1c = 0;
        int a2c = 0;
        int a3c = 0;
        int a4c = 0;
        int a5c = 0;
        int a6c = 0;
        for (Map.Entry<String, Patient> entry : commDirectory.entrySet()) {
            if(entry.getValue().lastEncounter == null){
                continue;
            }
            int age = entry.getValue().age;
            if(entry.getValue().lastEncounter.vs.isSystolicBPNormal(age) != 0){
                if(age == 0){
                    a1c++;
                }
                else if(age <= 1){
                    a2c++;
                }
                else if(age <= 3){
                    a3c++;
                }
                else if(age <= 6){
                    a4c++;
                }
                else if(age <= 12){
                    a5c++;
                }
                else{
                    a6c++;
                }
            }
        }
        System.out.println("Abnormal BP values for community "+communityName+ " with people "+count);
        System.out.println("Age  = 0  -- "+a1c);
        System.out.println("Age <= 1  -- "+a2c);
        System.out.println("Age <= 3  -- "+a3c);
        System.out.println("Age <= 6  -- "+a4c);
        System.out.println("Age <= 12 -- "+a5c);
        System.out.println("Age > 12  -- "+a6c);
        
    }
    
    public void loadPatients() throws FileNotFoundException, IOException{
        File file = new File("D:\\5100-Lab-Git\\Sharma_Apoorva_001566203\\Lab2-Part3-4\\Part3-4\\src\\model\\Patient.db");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while ((line = br.readLine()) != null) {
            String details[] = line.split(" ");
            Patient p = new Patient(details[0]);
            p.age = Integer.parseInt(details[1]);
            p.newEncounter(details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]), Integer.parseInt(details[5]), Integer.parseInt(details[6]), Integer.parseInt(details[7]));
            p.setAddress(details[8], details[9], details[10]);
            patientDirectory.put(details[0], p);
        }
        
        br.close();
        fr.close();
    }
    
}
