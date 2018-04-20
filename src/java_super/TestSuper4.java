package java_super;

/**
 * super() is added in each class constructor automatically by compiler if there is no super() is not mentioned
 */

class Animal3{
    Animal3(){
        System.out.println("Animal is created.");
    }
}

class Dog3 extends Animal3{
    Dog3(){
        System.out.println("Dog is created.");
    }
}

public class TestSuper4 {
    public static void main(String[] args) {
        Dog3 d1 = new Dog3();
    }
}
