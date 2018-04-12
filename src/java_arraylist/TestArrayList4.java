package java_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
// Example of addAll() method
public class TestArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Debesh");
        al2.add("Sani");
        al.addAll(al2); //adding second list in first list
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
