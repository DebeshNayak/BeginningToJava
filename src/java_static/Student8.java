package java_static;

public class Student8 {
    int rollNo;
    String name;
    static String college="ITS";

    Student8(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }

    public static void main(String args[]){
        Student8 s1 = new Student8(111, "Karan");
        Student8 s2 = new Student8(222, "Aryan");

        s1.display();
        s2.display();
    }
}
