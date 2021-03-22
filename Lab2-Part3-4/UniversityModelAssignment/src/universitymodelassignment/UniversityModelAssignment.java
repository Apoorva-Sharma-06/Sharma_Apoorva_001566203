/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymodelassignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaur
 */
public class UniversityModelAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course a = new Course("Physics", 1, 4);
        Course b = new Course("Mathematics", 2, 4);
        Course c = new Course("Chemistry", 3, 3);
        Course d = new Course("Biology", 4, 3);

        // STUDENT Portion
        // courseAB, A->studentID, B->CourseNumber
        CourseLoad course11 = new CourseLoad(1, a, 3);
        CourseLoad course12 = new CourseLoad(1, b, 4);

        // represents list of courses taken by student 1
        List<CourseLoad> coursesTaken1 = new ArrayList<>();
        coursesTaken1.add(course11);
        coursesTaken1.add(course12);

        Transcript transcript1 = new Transcript(coursesTaken1);
        StudentProfile studentA = new StudentProfile(1, "Mike", 10000,
                20000, transcript1);


        // For Student 2
        CourseLoad course21 = new CourseLoad(2, a, 4);
        CourseLoad course22 = new CourseLoad(2, c, 2);

        // represents list of courses taken by student 2
        List<CourseLoad> coursesTaken2 = new ArrayList<>();
        coursesTaken2.add(course21);
        coursesTaken2.add(course22);

        Transcript transcript2 = new Transcript(coursesTaken2);
        StudentProfile studentB = new StudentProfile(2, "Jones", 15000,
                21000, transcript2);

        StudentDirectory mainStudentDirectory = new StudentDirectory();
        mainStudentDirectory.addStudent(studentA);
        mainStudentDirectory.addStudent(studentB);


        // FACULTY Portion
        Faculty facultyA = new Faculty(100, "Professor", 2.5);
        facultyA.addCourse(b);
        facultyA.addCourse(c);
        facultyA.addCourse(d);

        FacultyDirectory facultyDirectory = new FacultyDirectory();
        facultyDirectory.addFaculty(facultyA);

        University northeastern = new University(1000, "Northeastern University",
                mainStudentDirectory, facultyDirectory);

        System.out.println(northeastern.getUniversityRating());
    }
    
}
