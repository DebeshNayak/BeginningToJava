package java_arraylist;

import java.util.ArrayList;

public class TestArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi"); // Adding object in array list
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        for(String obj:al){
            System.out.println(obj);
        }
    }
}
