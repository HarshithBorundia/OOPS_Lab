import java.util.List;

public class PHDStudent extends BITSStudent {
    String topic;
    String department;
    String guides[];
    int n;
    double schoolFinalPercentage;
    double graduationCGPA;
    public void setQualification(String q) {
        String[] qArr = Global.getCGPAs(q);
        this.schoolFinalPercentage = Double.parseDouble(qArr[0]);
        this.graduationCGPA = Double.parseDouble(qArr[1]);
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("Internal"))
            super.stipend = 37000;
        else if (stipendClass.equals("Project"))
            super.stipend = 45000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    }
    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a PHD student with topic  "+ this.topic + "\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"/% marks in 12th and "
                           +this.graduationCGPA+" CGPA in graduation and "
                           +stipendDetails+"\n");
    }
    public PHDStudent(String name, String ID, String department, String sfP, String stipend,String topic,String guides[]){
        super.name = name;
        super.ID = ID;
        super.email = "ph"+ID+"@hyderabad.bits-pilani.ac.in";
        this.topic = topic;
        this.department = department;
        setScholarship(stipend);;
        setQualification(sfP);
        this.guides = guides;
    }
    public PHDStudent(String name, String ID, String department, String sfP, String stipend,String topic, List<String> guides){
    super.name = name;
    super.ID = ID;
    super.email = "ph"+ID+"@hyderabad.bits-pilani.ac.in";
    this.topic = topic;
    this.department = department;
    setScholarship(stipend);
    setQualification(sfP);
    this.guides = guides.toArray(new String[0]); // convert list to array
}
    public double getCGPA(){
        return this.graduationCGPA;
    }
}
    
