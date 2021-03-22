package universitymodelassignment;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private int facultyID;
    private String facultyName;
    private List<Course> coursesTaught;
    private double rating;
    public Faculty(int facultyID, String facultyName, double rating){
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.coursesTaught = new ArrayList<>();
        this.rating = rating;
    }
    public int getFacultyID(){
        return facultyID;
    }
    public String getFacultyName(){
        return facultyName;
    }


    public void addCourse(Course course) {
        this.coursesTaught.add(course);
    }


    public double getRating(){
        return rating;
    }
}
