package java_super;

/**
 * super is used to invoke parent class constructor
 * - Note: super() is added in each class constructor automatically by compiler if there is no super() or this()
 */

class Animal2{
    Animal2(){
        System.out.println("animal is created");
    }
}

class Dog2 extends Animal2{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}

public class TestSuper3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}
