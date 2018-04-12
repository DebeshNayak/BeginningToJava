package java_linkedlist;

import java.util.LinkedList;

class Book{
    int id;
    String name, author, publisher;
    int quantity;

    Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class TestLinkedList2 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Let's C", "Yeswant Kanethkar", "Willy", 10);
        Book b2 = new Book(102, "Operating System", "Galvin", "Mc Graw Hill", 7);
        Book b3 = new Book(103, "Data Communication and Networking", "Foruzan", "Pearson", 8);

        LinkedList<Book> al = new LinkedList<Book>();
        al.add(b1);
        al.add(b2);
        al.add(b3);

        for(Book b:al){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
