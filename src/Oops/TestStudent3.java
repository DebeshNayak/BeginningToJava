package Oops;

public class TestStudent3 {
    public static void main(String args[]){
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();

        s1.insertRecord(103,"Pritam");
        s2.insertRecord(104, "Sunandini");

        s1.displayInformation();
        s2.displayInformation();
    }
}
