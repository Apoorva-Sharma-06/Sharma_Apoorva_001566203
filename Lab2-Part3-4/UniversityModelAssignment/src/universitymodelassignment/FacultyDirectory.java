package universitymodelassignment;

import java.util.ArrayList;
import java.util.List;

public class FacultyDirectory {
    private List<Faculty> faculties;
    public FacultyDirectory(){
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public double getAverageFacultyRating(){
        double totalRating = 0;
        for(Faculty faculty : faculties){
            totalRating += faculty.getRating();

        }
        int numberOfFaculties = faculties.size();
        return totalRating/numberOfFaculties;
    }
}
