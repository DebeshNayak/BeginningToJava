package java_this;

class B1{
    A4 obj;
    B1(A4 obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(); // using data member of A4 class
    }
}

class A4{
    int data = 10;
    A4(){

    }
}

public class TestThis6 {

}
