package java_arraylist;

import java.util.*;
// Java ArrayList Example: Traversing ArrayList using Iterator Interface
public class TestArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Creating array list
        list.add("Ravi"); // Adding object in array list
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}