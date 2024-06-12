import java.util.Scanner;

public class MainSt3 {
    public static void main(String[] args) {
        BITSStudent studentBand[] = new BITSStudent[6];
        studentBand[0] = new FDStudent("Noori", "2020PS4576H", Major.Computer_Science, "96", "2000");
        studentBand[1] = new FDCode("Rohit", "2020PS9876H", Major.Mathematics, "98", "UGNS",3,"C","C++","python");
        studentBand[2] = new FDCodeRobo("Sayani", "2020PS3645H", Major.Economics, "94", "UG",2,3,new String[]{"C","Matlab"},"Drones","humanoids");
        studentBand[3] = new HDStudent("Maya", "2023TS7656H", Major.Computer_Science, "92,8.45", "PG");
        studentBand[4] = new HDStudent("Kalki", "2023TS8765H", Major.Electronics, "91,7.92", "PGGate");
        studentBand[5] = new HDStudent("Harsh", "2023TS3517H", Major.Mathematics, "97,9.4", "20000");
        Scanner sc = new Scanner(System.in);
        System.out.println("What name do you want?");
        String key = sc.nextLine();
        Boolean found = false;
        for(BITSStudent student:studentBand){
            if(!found){
                if(key.equalsIgnoreCase(student.name)){
                    System.out.println("The student details are: \n");
                    student.printDetails();
                    found = true;
                    continue;
                }
            }
        }
        if(!found){
            System.out.println("Sorry this student does not exist!");
        }
        sc.close();
        Course ml = new Course("Machine Learning",CourseCode.BITS_F441,false,false,3);
        Course oop = new Course("Object Oriented Programming",CourseCode.CS_F213,true,true,4);
        ml.addStudent(studentBand[0]);
        oop.addStudent(studentBand[0]);
        ml.addStudent(studentBand[1]);
        oop.addStudent(studentBand[3]);
        System.out.println("\n\n Course student Lists are:");
        System.out.println("******"+ml.getName()+"******");
        for(BITSStudent bts:ml.getStudents()){
            System.out.println(bts.getName());
        }
        System.out.println("******"+oop.getName()+"******");
        for(BITSStudent bts:oop.getStudents()){
            System.out.println(bts.getName());
        }
    }
}
