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
    public static void main(String args[]) throws IOException{
        
        OurSystem os = new OurSystem();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String choice = "1";
        String subChoice;
        String superChoice;
        while(choice.equalsIgnoreCase("1")){
            System.out.println("Please choose what you wish to do");
            System.out.println("Press 1 to access a patient record");
            System.out.println("Press 2 to view the patient directory");
            superChoice = br.readLine();
            switch (superChoice){
                case "1" -> {
                    System.out.println("Please enter patient name");
                    String name = br.readLine();
                    Patient p = os.getPatient(name);            
                    System.out.println("Enter 1 to update patient age");
                    System.out.println("Enter 2 to add encounter");
                    System.out.println("Enter 3 to view encounter history");
            
                    subChoice = br.readLine();
            
                    switch (subChoice){
                        case "1" -> {
                            System.out.println("Please enter your age");
                            int age = Integer.parseInt(br.readLine());
                            p.setAge(age);
                        }
                        case "2" -> {
                            System.out.println("Enter age");
                            int age = Integer.parseInt(br.readLine());
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
                            p.setAge(age);
                            p.newEncounter(date, rr, hr, sbp, wk, wp);
                        }
                        case "3" -> {
                            p.printEncounterHistory();
                        }                
                    }
                }
                case "2" -> {
                    os.printPatientDirectory();
                }
            }
            System.out.println("Enter 1 if you want to continue. Press any other key to exit");
            choice = br.readLine();
        }
    }
}