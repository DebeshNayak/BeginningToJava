package Oops;

public class StudentDetails {
    int rollNo;
    String name;

    void insertRecord(int r, String n){
        rollNo = r;
        name = n;
    }

    void displayInformation(){
        System.out.println(rollNo+" "+name);
    }
}
