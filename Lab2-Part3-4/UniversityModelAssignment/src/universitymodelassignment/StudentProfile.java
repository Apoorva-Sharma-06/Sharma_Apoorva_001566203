/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymodelassignment;

import java.util.List;

/**
 *
 * @author shaur
 */
public class StudentProfile {
    private int studentID;
    private String studentName;
    private int joiningSalary;
    private int salaryAfterFiveYears;
    private Transcript transcript;
    public StudentProfile(int studentID, String studentName, int joiningSalary, int salaryAfterFiveYears,
                          Transcript transcript) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.joiningSalary = joiningSalary;
        this.salaryAfterFiveYears = salaryAfterFiveYears;
        this.transcript = transcript;
    }
    public int getStudentID(){
        return studentID;
    }
    public int getJoiningSalary(){
        return joiningSalary;
    }
    public int getSalaryAfterFiveYears(){
        return salaryAfterFiveYears;
    }


    public double getGPA() {
        List<CourseLoad> courses = transcript.getCoursesTaken();
        int numberOfCoursesTaken = courses.size();
        double totalGPA = 0;
        for(CourseLoad course : courses) {
            totalGPA += course.getGrade();
        }
        return totalGPA / numberOfCoursesTaken;
    }
}
