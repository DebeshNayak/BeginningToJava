package Oops;

public class TestEmployee {
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insertEmployee(101, "Debesh Nayak", 24000);
        e2.insertEmployee(102, "Sofia Nayak", 23000);
        e3.insertEmployee(103, "Pritam Patel", 6000);

        e1.display();
        e2.display();
        e3.display();
    }
}
