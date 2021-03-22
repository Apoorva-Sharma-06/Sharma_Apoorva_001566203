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
public class Course {
    private int id;
    private String name;
    private int credits;
    
    public Course(String name, int id, int credits){
        this.name = name;
        this.id = id;
        this.credits = credits;
    }
    public int getCourseNumber(){
        return this.id;
    }
    

}