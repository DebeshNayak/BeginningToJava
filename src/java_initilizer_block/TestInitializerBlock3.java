package java_initilizer_block;

/**
 * Program of instance initializer block that is invoked after super()
 */
class A{
    A(){
        System.out.println("Parent class constructor is invoked");
    }
}

class B extends A{
    B(){
        System.out.println("Child class constructor is invoked");
    }

    {
        System.out.println("Instance initializer block is invoked");
    }
}
public class TestInitializerBlock3 {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
