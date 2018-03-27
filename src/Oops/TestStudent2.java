package Oops;

// we can also create multiple objects and store information in it through reference variable
public class TestStudent2 {
    public static void main(String args[]){
        //Creating boject
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 101;
        s1.name = "Debesh";

        s2.id = 102;
        s2.name = "Sofia";

        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
