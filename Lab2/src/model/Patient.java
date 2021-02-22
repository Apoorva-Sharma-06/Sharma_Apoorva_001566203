/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apoorva Sharma
 */
public class Patient {
    private List<VitalSigns> vitalSignHistory;
    //Current vital sign
    private VitalSigns vitalSigns;
    private String name;
    private int age;

    public Patient(VitalSigns vitalSigns, String name, int age) {
        vitalSignHistory = new ArrayList<>();
        this.vitalSigns = vitalSigns;
        this.name = name;
        this.age = age;
    }

    public Patient(String name, int age) {
        vitalSignHistory = new ArrayList<>();
        this.name = name;
        this.age = age;
    }
    
    public VitalSigns newVitalSign(String date, int respiratoryRate, int heartRate, int systolicBP, int weightK, double weightP) {
        if(this.vitalSigns != null){
            vitalSignHistory.add(this.vitalSigns);
        }
        return new VitalSigns(date, respiratoryRate, heartRate, systolicBP, weightK, weightP);
    }
    
    public void checkSpecificVS(String name){
        if(this.vitalSigns == null){
            System.out.println("No vital sign info for patient exists");
            return;
        }
        int n = -2;
        if(name.equalsIgnoreCase("Respiratory Rate")){
            n = this.vitalSigns.isRespiratoryRateNormal(this.age);
        }
        else if(name.equalsIgnoreCase("Heart Rate")){
            n = this.vitalSigns.isHeartRateNormal(this.age);
        }
        else if(name.equalsIgnoreCase("Systolic Blood Pressure")){
            n = this.vitalSigns.isSystolicBPNormal(this.age);
        }
        else if(name.equalsIgnoreCase("Weight in Kilos")){
            n = this.vitalSigns.isWeightKNormal(this.age);
        }
        else if(name.equalsIgnoreCase("Weight in pounds")){
            n = this.vitalSigns.isWeightPNormal(this.age);
        }
        if(n == 0){
            System.out.println("Vital is normal");
        }
        else if(n == -2){
            System.out.println("Incorrect vital name provided");
        }
        else {
            System.out.println("Vital is abnormal");
        }
    }
    
    public void isPatientNormal() {
        if(this.vitalSigns == null){
            System.out.println("No vital sign info for patient exists");
            return;
        }
        int rr = this.vitalSigns.isRespiratoryRateNormal(this.age);
        int hr = this.vitalSigns.isHeartRateNormal(this.age);
        int sbp = this.vitalSigns.isSystolicBPNormal(this.age);
        int wk = this.vitalSigns.isWeightKNormal(this.age);
        int wp = this.vitalSigns.isWeightPNormal(this.age);
        if((hr == 1 || sbp == 1 || rr == 1) && (wk == 0) && (wp == 0)){
            System.out.println("Abnormal Vitals. Might be because of fever or stress. If not, please visit a doctor");      
        }
        else if(this.age <= 12 && hr == -1){
            System.out.println("Abnormal Vitals. Might be symptoms of Bradycardia. Please visit a doctor.");
        }
        else if (hr !=0 || rr != 0 || sbp != 0 || wk != 0 || wp != 0){
            System.out.println("Abnormal Vitals.");
        }
        else {
            System.out.println("Normal Vitals.");
        }
        
    }
    
    public void printVitalHistory(){
        if(vitalSignHistory.isEmpty()){
            System.out.println("No history found for patient");
            return;
        }
        System.out.println("Vital Sign History for "+this.name);
        System.out.println("RR HR BP WK WP Date");
        for (VitalSigns vitalSigns1 : vitalSignHistory) {
            System.out.println(vitalSigns1.getHeartRate() + " " + vitalSigns1.getHeartRate() + " " + vitalSigns1.getSystolicBP() + " " + vitalSigns1.getWeightK() + " " + vitalSigns1.getWeightP() + " " +vitalSigns1.getDate());
        }
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
