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
public class Transcript {
    private List<CourseLoad> coursesTaken;
    public Transcript(List<CourseLoad> courses) {
        this.coursesTaken = courses;
    }
    public List<CourseLoad> getCoursesTaken(){
        return coursesTaken;
    }
}
