package universitymodelassignment;

public class University implements Comparable<University> {
    private int universitytID;
    private String universityName;
    private StudentDirectory studentDirectory;
    private FacultyDirectory facultyDirectory;
    private double universityRating;
    public University(int universitytID, String universityName, StudentDirectory studentDirectory,
                      FacultyDirectory facultyDirectory){
        this.universitytID = universitytID;
        this.universityName = universityName;
        this.studentDirectory = studentDirectory;
        this.facultyDirectory = facultyDirectory;
        this.setUniversityRating();

    }

    public double getUniversityRating() {
        return universityRating;
    }

    public void setUniversityRating(){
        double averageGPA = studentDirectory.getAverageGPA();
        double averageFacultyRating = facultyDirectory.getAverageFacultyRating();
        double averageJoiningSalary = studentDirectory.getAverageJoiningSalary();
        this.universityRating = (averageGPA + averageFacultyRating + averageJoiningSalary/1000)/3;
    }

    @Override
    public int compareTo(University u) {
        if (u.getUniversityRating() > this.getUniversityRating()) {
            return 1;
        } else if (u.getUniversityRating() < this.getUniversityRating()) {
            return -1;
        }
        return 0;
    }

}
