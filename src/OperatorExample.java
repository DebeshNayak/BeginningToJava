public class OperatorExample {
    public static void main(String args[]){
        // Example 1: Unary Operator ++ and --
//        int x = 10;
//        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x--);
//        System.out.println(--x);

        // Example 2: Unary Operator ++ and --
//        int a = 10;
//        int b = 10;
//        System.out.println(a++ + ++a); //10+12=22
//        System.out.println(b++ + b++); //10+11=21

        // Example 3: Unary Operator: ~ and !
//        int a = 100;
//        int b = -8;
//        boolean c = true;
//        boolean d = false;
//        System.out.println(~a);//-101 (minus of total positive value which starts from 0)
//        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
//        System.out.println(!c); // false (opposite of boolean value)
//        System.out.println(!d); // true

        // Example 4: Arithmetic Operator
//        int a = 10;
//        int b = 5;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

        // Example 5: Arithmetic Operator: Expression
//        System.out.println(10*10/5+3-1*4/2);

        // Example 6: Left Shift
//        System.out.println(10<<2); // 10*2^2=10*4=40
//        System.out.println(10<<3); // 10*2^3=10*8=80
//        System.out.println(20<<2); // 20*2^2=20*4=80
//        System.out.println(15<<4); // 15*2^4=15*16=240

        // Example 7: Right Shift
//        System.out.println(10>>2); // 10/2^2=10/4=2
//        System.out.println(20>>2); // 20/2^2=20/4=5
//        System.out.println(20>>3); // 20/2^3=20/8=2

        // Example 8: Shift Operator >> vs >>>
//        System.out.println(20>>2);
//        System.out.println(20>>>2);

        // Example 9: Shift Operator: >> vs >>>
//        System.out.println(20>>2);
//        System.out.println(20>>>2);
//        // For negative number, >>> changes parity bit (MSB) to 0
//        System.out.println(-20>>2);
//        System.out.println(-20>>>2);

        // Example 10: Logical && and Bitwise &
//        int a = 10;
//        int b = 5;
//        int c = 20;
//        System.out.println(a>b&&a<c); // false && true == flase
//        System.out.println(a>b&a<c); // flase & true = flase

        // Logical && vs Bitwise &
//        System.out.println(a<b&&a++<c); // false && true = flase
//        System.out.println(a); // 10 because second condition is not checked
//        System.out.println(a<b&a++<c);
//        System.out.println(a);// 11 becaues second condition is checked

        // Logical || and Bitwise |
//        System.out.println(a>b||a<c);//true || true = true
//        System.out.println(a>b|a<c);//true | true = true
//        // || vs |
//        System.out.println(a>b || a++<c);// true || true = true
//        System.out.println(a); // 10 because second codition is not checked
//        System.out.println(a>b|a++<c); // true || true = true
//        System.out.println(a); // 11 because second condition is checked

        // Example 11: Ternary Operator
//        int a = 10;
//        int b = 5;
//        int min = (a<b)?a:b;
//        System.out.println(min);

        // Example 12: Assignment Operator
//        int a = 10;
//        int b = 20;
//        a+=4;
//        b-=4;
//        System.out.println(a);
//        System.out.println(b);
//        a += 3; // 10 + 3
//        System.out.println(a);
//        a -= 4; // 13 - 4
//        System.out.println(a);
//        a *= 2; // 9 * 2
//        System.out.println(a);
//        a /= 2; // 18 / 2
//        System.out.println(a);

        // Adding short
        short a = 10;
        short b = 10;
        // a += b; // internally so fine
        a = (short)(a + b); // compile time error because 10 + 10 = 20 now int
        System.out.println(a);


    }
};
