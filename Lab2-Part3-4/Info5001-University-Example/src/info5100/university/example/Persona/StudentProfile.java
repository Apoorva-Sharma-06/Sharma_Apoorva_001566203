/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    
    double joiningSalary;
    double fiveYearSalary;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
    //Returns GPA for this student
    public double getGPA() {
        return this.transcript.getGPA();
    }
    
    //Set student grade
    public void setGrade(String course, double grade) {
        this.transcript.setGrade(course, grade);
    }
    
    public double getJoiningSalary() {
        return joiningSalary;
    }

    public void setJoiningSalary(double joiningSalary) {
        this.joiningSalary = joiningSalary;
    }

    public double getFiveYearSalary() {
        return fiveYearSalary;
    }

    public void setFiveYearSalary(double fiveYearSalary) {
        this.fiveYearSalary = fiveYearSalary;
    }
}
