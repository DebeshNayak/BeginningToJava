package java_super;

/**
 * Super is used to refer immediate parent class instance variable
 * - It is useful if the parent and child class have same fields
 */
class Animal{
    String color = "white";
}

class Dog extends Animal{
    String color = "black";

    void printColor(){
        System.out.println(color); // prints the color of Dog class
        System.out.println(super.color); // prints the color of Animal class
    }
}
public class TestSuper1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
