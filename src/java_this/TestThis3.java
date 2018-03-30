package java_this;

// this() to invoke current class constructor
class B{
    B(){
        this(10);
        System.out.println("Hello a");
    }

    B(int x){
        // this();
        System.out.println(x);
    }
}

class TestThis3{
    public static void main(String args[]){
        B a = new B();
    }
}
