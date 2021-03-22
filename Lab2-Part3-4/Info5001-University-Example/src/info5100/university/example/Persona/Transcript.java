/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
    public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);    
    }
    
    
    //Calculate overall GPA by calculating GPA for each sem
    public double getGPA(){
        double GPA = 0;
        int courses = 0;
        ArrayList<SeatAssignment> seatassignments;
        for (Map.Entry<String, CourseLoad> entry : courseloadlist.entrySet()) {
            CourseLoad cl = entry.getValue();
            seatassignments = cl.getSeatAssignments();
            for (int i=0; i<seatassignments.size(); i++) {
                courses++;
                GPA += seatassignments.get(i).getGrade();
            }
        }
        if(courses > 0){
            GPA = GPA/courses;
        }
        return GPA;
    }
    
    public void setGrade(String course, double grade) {
        ArrayList<SeatAssignment> seatassignments;
        for (Map.Entry<String, CourseLoad> entry : courseloadlist.entrySet()) {
            CourseLoad cl = entry.getValue();
            seatassignments = cl.getSeatAssignments();
            for (int i=0; i<seatassignments.size(); i++) {
                if(seatassignments.get(i).getSeat().getCourseOffer().getCourseNumber()
                        .equals(course)){
                    seatassignments.get(i).assignGrade(grade);
                    return;
                }
            }
        }
    }
    
    public void rateFaculty(String course, double rating) {
        ArrayList<SeatAssignment> seatassignments;
        for (Map.Entry<String, CourseLoad> entry : courseloadlist.entrySet()) {
            CourseLoad cl = entry.getValue();
            seatassignments = cl.getSeatAssignments();
            for (int i=0; i<seatassignments.size(); i++) {
                if(seatassignments.get(i).getSeat().getCourseOffer().getCourseNumber()
                        .equals(course)){
                    seatassignments.get(i).getSeat().getCourseOffer().rateFaculty(rating);
                }
            }
        }
    }
}
