import java.util.Scanner;

public class MainSt4 {
    public static void main(String[] args) {
        BITSStudent studentBand[] = new BITSStudent[6];
        studentBand[0] = new FDStudent("Noori", "2020PS4576H", Major.Computer_Science, "96", "2000");
        studentBand[1] = new FDCode("Rohit", "2020PS9876H", Major.Mathematics, "98", "UGNS",3,"C","C++","python");
        studentBand[2] = new FDCodeRobo("Sayani", "2020PS3645H", Major.Economics, "94", "UG",2,3,new String[]{"C","Matlab"},"Drones","humanoids");
        studentBand[3] = new HDStudent("Maya", "2023TS7656H", Major.Computer_Science, "92,8.45", "PG");
        studentBand[4] = new HDStudent("Kalki", "2023TS8765H", Major.Electronics, "91,7.92", "PGGate");
        studentBand[5] = new HDStudent("Harsh", "2023TS3517H", Major.Mathematics, "97,9.4", "20000");
        Scanner sc = new Scanner(System.in);
        double cgpa = sc.nextDouble();
        for(BITSStudent student:studentBand){
            if((student instanceof HDStudent || student instanceof PHDStudent)  && student.getCGPA() > cgpa){
                System.out.println(student.getName());
            }
        }
        System.out.println("******");
        for(BITSStudent student:studentBand){
            if(student instanceof FDStudent && student.getCGPA() < cgpa){
                System.out.println(student.getName());
            }
        }
        sc.close();

    }


}

