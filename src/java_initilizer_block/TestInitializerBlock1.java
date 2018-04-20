package java_initilizer_block;

/**
 * Why use instance initializer block?
 * Ans: If I have to perform some operation while assigninig value to instance data member
 * e.g.: a for loop to fill a complex array or error handling
 */
class Bike{
    int speed;

    Bike(){
        System.out.println("Speed is: "+speed);
    }

    {
        speed = 100;
    }
}

public class TestInitializerBlock1 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
    }
}
