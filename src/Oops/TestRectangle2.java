package Oops;

// Creating multiple object by one type only
public class TestRectangle2 {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(), r2 = new Rectangle(); // creating two objects

        r1.insert(22, 33);
        r2.insert(44, 55);

        r1.calculateArea();
        r2.calculateArea();
    }
}
