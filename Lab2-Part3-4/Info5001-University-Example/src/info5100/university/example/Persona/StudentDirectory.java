/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public double getAverageJoiningSalary() {
        int studentCount = 0;
        int averageSalary = 0;
        for (int i=0; i<studentlist.size(); i++){
            studentCount++;
            averageSalary += studentlist.get(i).getJoiningSalary();
        }
        if(studentCount > 0){
            averageSalary = averageSalary / studentCount;
        }
        return averageSalary;
    }
    
    public double getAverageFiveYearSalary() {
        int studentCount = 0;
        int averageSalary = 0;
        for (int i=0; i<studentlist.size(); i++){
            studentCount++;
            averageSalary += studentlist.get(i).getFiveYearSalary();
        }
        if(studentCount > 0){
            averageSalary = averageSalary / studentCount;
        }
        return averageSalary;
    }
    
    public double getAverageStudentGPA () {
        int studentCount = 0;
        int averageGPA = 0;
        for (int i=0; i<studentlist.size(); i++){
            studentCount++;
            averageGPA += studentlist.get(i).getGPA();
        }
        if(studentCount > 0){
            averageGPA = averageGPA / studentCount;
        }
        return averageGPA;
    }
    
}
