package java_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

// Linked List Example
public class TestLinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Debesh");
        al.add("Sofia");

        Iterator<String> itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
