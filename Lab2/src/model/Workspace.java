/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Apoorva Sharma
 */
public class Workspace {
    
    public static void testCases(){
        //Test 1 - Abnormal vitals
        VitalSigns vs = new VitalSigns("Jan 1", 25, 110, 130, 40, 80);
        Patient p = new Patient(vs, "Test1", 40);
        p.isPatientNormal();
        
        //Test 2 - Abnormal vitals - possible fever or stress symptoms
        VitalSigns vs2 = new VitalSigns("Feb 1", 25, 110, 130, 60, 120);
        Patient p2 = new Patient(vs2, "Test2", 40);
        p2.isPatientNormal();
        
        //Test 3 - Abnormal vitals - possible bradycardia
        VitalSigns vs3 = new VitalSigns("Mar 1", 30, 70, 70, 4, 9);
        Patient p3 = new Patient(vs3, "Test3", 1);
        p3.isPatientNormal();
        
        //Test 4 - Normal vitals
        VitalSigns vs4 = new VitalSigns("Apr 1", 30, 80, 70, 4, 9);
        Patient p4 = new Patient(vs4, "Test3", 1);
        p4.isPatientNormal();
    }
    
    public static void main(String args[]) throws IOException{
        String choice = "1";
        Patient p;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter patient name");
        String name = br.readLine();
        System.out.println("Enter patient age");
        int age = Integer.parseInt(br.readLine());
        
        p = new Patient(name, age);
        String subChoice;
        while(choice.equalsIgnoreCase("1")){
            System.out.println("Enter 1 to add a vital sign");
            System.out.println("Enter 2 to print vital sign history");
            System.out.println("Enter 3 to check if patient is normal");
            System.out.println("Enter 4 to check if a specific vital sign is normal");
            System.out.println("Enter 5 to run test cases");
            subChoice = br.readLine();
            switch (subChoice){
                case "1" -> {
                    System.out.println("Enter vital sign information");
                    System.out.println("Enter Respiratory rate");
                    int rr = Integer.parseInt(br.readLine());
                    System.out.println("Enter Heart rate");
                    int hr = Integer.parseInt(br.readLine());
                    System.out.println("Enter Blood Pressure");
                    int sbp = Integer.parseInt(br.readLine());
                    System.out.println("Enter weight in kilos");
                    int wk = Integer.parseInt(br.readLine());
                    System.out.println("Enter weight in pounds");
                    int wp = Integer.parseInt(br.readLine());
                    System.out.println("Enter date when VS was taken");
                    String date = br.readLine();
                    VitalSigns vs = p.newVitalSign(date, rr, hr, sbp, wk, wp);
                    p.setVitalSigns(vs);
                }
                case "2" -> p.printVitalHistory();
                case "3" -> p.isPatientNormal();
                case "4" -> {
                    System.out.println("Enter vital sign name");
                    String vsName = br.readLine();
                    p.checkSpecificVS(vsName);
                }
                case "5" -> testCases();
            }
            System.out.println("Enter 1 if you want to continue");
            choice = br.readLine();
        }  
    }
}
