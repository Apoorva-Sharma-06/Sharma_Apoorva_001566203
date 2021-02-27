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
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int systolicBP;
    private int weightK;
    private double weightP;

    public VitalSigns(int respiratoryRate, int heartRate, int systolicBP, int weightK, double weightP) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBP = systolicBP;
        this.weightK = weightK;
        this.weightP = weightP;
    }
    
    public int isRespiratoryRateNormal(int age){
        if(age == 0){
            if(this.respiratoryRate < 30){
                return -1;
            }
            else if(this.respiratoryRate > 50){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 1) {
            if(this.respiratoryRate < 20){
                return -1;
            }
            else if(this.respiratoryRate > 30){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 3) {
            if(this.respiratoryRate < 20){
                return -1;
            }
            else if(this.respiratoryRate > 30){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 6) {
            if(this.respiratoryRate < 20){
                return -1;
            }
            else if(this.respiratoryRate > 30){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 12) {
            if(this.respiratoryRate < 20){
                return -1;
            }
            else if(this.respiratoryRate > 30){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if(this.respiratoryRate < 12){
                return -1;
            }
            if(this.respiratoryRate > 20){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    
    public int isHeartRateNormal(int age){
        if(age == 0){
            if(this.heartRate < 120){
                return -1;
            }
            else if(this.heartRate > 160){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 1) {
            if(this.heartRate < 80){
                return -1;
            }
            else if(this.heartRate > 140){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 3) {
            if(this.heartRate < 80){
                return -1;
            }
            else if(this.heartRate > 130){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 6) {
            if(this.heartRate < 80){
                return -1;
            }
            else if(this.heartRate > 120){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 12) {
            if(this.heartRate < 70){
                return -1;
            }
            else if(this.heartRate > 110){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if(this.heartRate < 55){
                return -1;
            }
            if(this.heartRate > 105){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    
    public int isSystolicBPNormal(int age){
        if(age == 0){
            if(this.systolicBP < 50){
                return -1;
            }
            else if(this.systolicBP > 70){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 1) {
            if(this.systolicBP < 70){
                return -1;
            }
            else if(this.systolicBP > 100){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 3) {
            if(this.systolicBP < 80){
                return -1;
            }
            else if(this.systolicBP > 110){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 6) {
            if(this.systolicBP < 80){
                return -1;
            }
            else if(this.systolicBP > 110){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 12) {
            if(this.systolicBP < 80){
                return -1;
            }
            else if(this.systolicBP > 120){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if(this.systolicBP < 110){
                return -1;
            }
            if(this.systolicBP > 120){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    
    public int isWeightKNormal(int age){
        if(age == 0){
            if(this.weightK < 2){
                return -1;
            }
            else if(this.weightK > 3){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 1) {
            if(this.weightK < 4){
                return -1;
            }
            else if(this.weightK > 10){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 3) {
            if(this.weightK < 11){
                return -1;
            }
            else if(this.weightK > 14){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 6) {
            if(this.weightK < 15){
                return -1;
            }
            else if(this.weightK > 18){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 12) {
            if(this.weightK < 20){
                return -1;
            }
            else if(this.weightK > 42){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if(this.weightK < 50){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
    
    public int isWeightPNormal(int age){
        if(age == 0){
            if(this.weightP < 4.5) {
                return -1;
            }
            else if(this.weightP > 7) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 1) {
            if(this.weightP < 9){
                return -1;
            }
            else if(this.weightP > 22){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 3) {
            if(this.weightP < 23){
                return -1;
            }
            else if(this.weightP > 31){
                return 1;
            }
            else {
                return 0;
                
            }
        }
        else if(age <= 6) {
            if(this.weightP < 32){
                return -1;
            }
            else if(this.weightP > 40){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(age <= 12) {
            if(this.weightP < 41){
                return -1;
            }
            else if(this.weightP > 92){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if(this.weightP < 110){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
    
    public int getrespiratoryRate() {
        return respiratoryRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSystolicBP() {
        return systolicBP;
    }

    public int getWeightK() {
        return weightK;
    }

    public double getWeightP() {
        return weightP;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setSystolicBP(int systolicBP) {
        this.systolicBP = systolicBP;
    }

    public void setWeightK(int weightK) {
        this.weightK = weightK;
    }

    public void setWeightP(int weightP) {
        this.weightP = weightP;
    }
    
    
}
