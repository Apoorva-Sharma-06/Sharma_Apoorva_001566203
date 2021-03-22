package universitymodelassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniversityDirectory {
    List<University> universities;
    public UniversityDirectory(){
        universities = new ArrayList<>();

    }
    public void addUniversity(University university){
        universities.add(university);
    }
    public List<University> getUniversities(){
        Collections.sort(universities);
        return universities;
    }
}
