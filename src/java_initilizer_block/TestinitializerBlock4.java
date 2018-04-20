package java_initilizer_block;

/**
 * Instance initializer block is invoked by every constructor call
 */
class A1{
    A1(){
        System.out.println("parent class constructor is invoked");
    }
}

class B1 extends A1{
    B1(){
        System.out.println("child class constructor is invoked");
    }
    B1(int a){
        System.out.println("child class constructor is invoked: "+a);
    }

    {
        System.out.println("instance initializer block is invoked");
    }
}

public class TestinitializerBlock4 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        B1 b2 = new B1(10);
    }
}
