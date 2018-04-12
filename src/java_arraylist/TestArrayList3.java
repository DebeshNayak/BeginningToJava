package java_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

// Example of user-defined class object in Java ArrayList
public class TestArrayList3 {
    public static void main(String[] args) {
        // Creating user-definded class objects
        Student s1 = new Student(101, "Debesh", 23);
        Student s2 = new Student(102, "Sofia", 28);
        Student s3 = new Student(103, "Satish", 20);

        // Creating array list
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);// adding Student class object
        al.add(s2);
        al.add(s3);

        // Getting Iterator
        Iterator itr = al.iterator();

        // traversing element of ArrayList object
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}
