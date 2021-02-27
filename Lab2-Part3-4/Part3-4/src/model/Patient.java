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
public class Patient extends Person{
    List<Encounter> encounterHistory;

    public Patient(String name) {
        encounterHistory = new ArrayList<>();
        super.name = name;
    }
    
    public void newEncounter(String date, int respiratoryRate, int heartRate, int systolicBP, int weightK, double weightP) {
        VitalSigns vs = new VitalSigns(respiratoryRate, heartRate, systolicBP, weightK, weightP);
        Encounter e = new Encounter(vs, date);
        encounterHistory.add(e);
    }
    
    public void printEncounterHistory(){
        if(encounterHistory.isEmpty()){
            System.out.println("No history found for patient");
            return;
        }
        System.out.println("Encounter History for "+this.name);
        System.out.println("RR HR BP WK WP Date");
        for (Encounter encounter : encounterHistory) {
            System.out.println(encounter.vs.getHeartRate() + " " + encounter.vs.getHeartRate() + " " + encounter.vs.getSystolicBP() + " " + encounter.vs.getWeightK() + " " + encounter.vs.getWeightP() + " " +encounter.date);
        }
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    @Override
    public void setAge(int age) {
        super.age = age;
    }
}
