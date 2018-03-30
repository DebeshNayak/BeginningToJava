package java_this;

// this to pass an argument in the method
class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }

    void p(){
        m(this);
    }
}

public class TestThis5 {
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}
