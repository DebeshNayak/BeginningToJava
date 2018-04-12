package java_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Debesh");
        al.add("Prafulla");
        al.add("Sandhya");

        List<String> list = new LinkedList<String>();
        list.add("Sani");
        list.add("Sudhanshu");
        list.add("Rupeshi");

        System.out.println(al);
        System.out.println(list);
    }
}
