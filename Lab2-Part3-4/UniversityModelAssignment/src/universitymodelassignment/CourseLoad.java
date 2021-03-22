/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymodelassignment;

/**
 *
 * @author shaur
 */
public class CourseLoad {
    private int studentID;
    private Course course;
    private double grade;
    public CourseLoad(int studentID, Course course, double grade) {
        this.course = course;
        this.studentID = studentID;
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
}
