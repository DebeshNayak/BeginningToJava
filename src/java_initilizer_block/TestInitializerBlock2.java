package java_initilizer_block;

/**
 * What is invoked first, instance initilizer block or constructor?
 * Ans: Constructor. It seemd that instance initilizer block is firstly invoked but NO.
 * Instance initializer block is invoked at the time of object creation.
 *
 * The Java compiler compiles the  instance initializer block to the constructor after the first statement super().
 */

class Bike1{
    int speed;
    Bike1(){
        System.out.println("Constructor is invoked");
    }

    {
        System.out.println("Instance initilizer");
    }
}

public class TestInitializerBlock2 {
    public static void main(String[] args) {
        Bike1 b1 = new Bike1();
        Bike1 b2 = new Bike1();
    }
}
