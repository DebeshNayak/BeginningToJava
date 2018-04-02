package java_inheritance;

/**
 * Hierarchical Inheritance
 */
// Animal and Dog class has already been defined in TestInheritance2.java
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class TestInheritance4 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
