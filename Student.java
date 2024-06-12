public class Student {
    String name;
    String ID;
    double CGPA;
    Address address;
    public Student(String n, String i, double c,Address address){
        this.name = n;
        this.ID = i;
        this.CGPA = c;
        this.address = address;
    }
    String getID(){
        return this.ID;
    }
    String getName(){
        return this.name;
    }
    double getCGPA(){
        return this.CGPA;
    }
    String getStudentPincode(){
        return this.address.pincode;
    }
}
