package Oops;

public class TestRectangle {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insert(24, 30);
        r2.insert(50, 20);

        r1.calculateArea();
        r2.calculateArea();
    }
}
