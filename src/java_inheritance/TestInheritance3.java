package java_inheritance;

/**
 * Multi-level inheritance
 */
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}

public class TestInheritance3 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
