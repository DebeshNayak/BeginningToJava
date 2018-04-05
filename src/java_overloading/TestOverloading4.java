package java_overloading;

// Overloading with Type promotion
class OverloadingTypePromotion{
    void sum(int a, long b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class TestOverloading4 {
    public static void main(String[] args) {
        OverloadingTypePromotion obj = new OverloadingTypePromotion();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
    }
}
