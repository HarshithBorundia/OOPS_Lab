import java.util.*;
public class Course {
     String name;
     CourseCode code;
     boolean isCDC;
     boolean hasLab;
     int credits;
     List<BITSStudent> registeredStudents = new ArrayList<BITSStudent>();
    public Course(String name, CourseCode code,boolean isCDC,boolean hasLab,int credits){
        this.name = name;
        this.code = code;
        this.isCDC = isCDC;
        this.hasLab = hasLab;
        this.credits = credits;

    }
    public void addStudent(BITSStudent s){
        this.registeredStudents.add(s);
    }
    public List<BITSStudent> getStudents(){
        return this.registeredStudents;
    }
    public String getName(){
        return this.name;
    }
}
