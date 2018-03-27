public class Simple {
    static public void main(String... args){
        // Vairable: Add
//        int a = 10;
//        int b = 10;
//        int c = a + b;
//
//        System.out.println(c);

        // Variable: Widening
//        int a = 10;
//        float f = a;
//
//        System.out.println(a);
//        System.out.println(f);

        // Narrowing: (Typecasting)
//        float f = 10.5f;
//        // int a = f; // Compile time error
//        int a = (int)f;
//        System.out.println(f);
//        System.out.println(a);

        // Variable: Overflow
//        int a = 130;
//        byte b = (byte)a;
//        System.out.println(a); // 130
//        System.out.println(b); // -126

        // Variable: Adding lower type
        byte a = 10;
        byte b = 10;

        // byte c = a + b; // Compile time error: because a+b=20 will be int
        byte c = (byte)(a+b);
        System.out.println(c);
    }
};
