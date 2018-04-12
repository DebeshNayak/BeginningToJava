package java_arraylist;

import java.util.ArrayList;
import java.util.List;

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quanitity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quanitity;
    }
}

// Example of Array List
public class TestArrayList7 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();

        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data communication & Networking", "Forouzan", "Mc Grw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

        // Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
        }
    }
}
