package java_this;

// this keyword can be used to return current class instance
class A1{
    A1 getA(){
        return this;
    }

    void msg(){
        System.out.println("Hello Java");
    }
}

public class TestThis7 {
    public static void main(String[] args) {
        new A1().getA().msg();
    }
}