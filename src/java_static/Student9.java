package java_static;

import Oops.Student;

public class Student9 {
    int rollNo;
    String name;
    static String college = "ITS"; //

    static void change(){ // static method
        college = "BBDIT";
    }

    Student9(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }

    public static void main(String args[]){
        Student9 s0 = new Student9(1, "Debesh");

        s0.display();

        Student9.change();

        Student9 s1 = new Student9(111, "Karan");
        Student9 s2 = new Student9(222, "Aryan");
        Student9 s3 = new Student9(333, "Sonoo");

        s1.display();
        s2.display();
        s3.display();

    }
}
