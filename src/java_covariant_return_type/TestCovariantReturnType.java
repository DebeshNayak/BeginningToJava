package java_covariant_return_type;

/**
 * covariant return type: override metthod by chaning the return tpe if subclass overrides
 * any method whose return type is Non-Primitive but it changes its return type to subclass type
 */
class A{
    A get(){
        return this;
    }
}

class B extends A{
    B get(){
        return this;
    }

    void message(){
        System.out.println("Welcome to covariant return type");
    }
}

public class TestCovariantReturnType {
    public static void main(String[] args) {
        new B().get().message();
    }
}
