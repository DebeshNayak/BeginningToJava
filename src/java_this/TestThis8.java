package java_this;

class A5{
    void m(){
        System.out.println(this);
    }
}

public class TestThis8 {
    public static void main(String[] args) {
        A5 obj = new A5();
        System.out.println(obj);
        obj.m();
    }
}
