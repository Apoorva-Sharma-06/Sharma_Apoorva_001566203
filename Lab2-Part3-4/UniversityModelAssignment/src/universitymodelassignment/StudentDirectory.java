package universitymodelassignment;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDirectory {
    private List<StudentProfile> directory;
    private Map<Integer, Pair<Integer,Integer>> salaryData;
    public StudentDirectory() {
        directory = new ArrayList<>();
    }

    public void addStudent(StudentProfile studentProfile) {
        directory.add(studentProfile);
    }

    public void getSalaryData(){
        salaryData = new HashMap<>();
        for(StudentProfile studentProfile : directory){
            int id = studentProfile.getStudentID();
            int joiningSalary = studentProfile.getJoiningSalary();
            int salaryAfterFiveYears = studentProfile.getSalaryAfterFiveYears();
            salaryData.put(id, new Pair(joiningSalary, salaryAfterFiveYears));

        }

    }

    public double getAverageGPA(){
        double totalGPA = 0;
        for(StudentProfile studentProfile : directory){
            totalGPA += studentProfile.getGPA();

        }
        int numberOfStudents = directory.size();
        return totalGPA/numberOfStudents;
    }
    public double getAverageJoiningSalary(){
        double joiningSalary = 0;
        for(StudentProfile studentProfile : directory){
            joiningSalary += studentProfile.getJoiningSalary();

        }
        int totalStudents = directory.size();
        return joiningSalary/totalStudents;
    }
}
