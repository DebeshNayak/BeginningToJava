package java_overloading;

// Overloading type promotion ambiguity
class OverloadingTypePromotionAmbiguity{
    void sum(int a, long b){
        System.out.println("a method invoked");
    }
    void sum(long a, int b){
        System.out.println("a method invoked");
    }
}
public class TestOverloading5 {
    public static void main(String[] args) {
        OverloadingTypePromotionAmbiguity obj = new OverloadingTypePromotionAmbiguity();
        // obj.sum(20, 20); // ambiguity
    }
}
