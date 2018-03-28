package java_static;

/**
 * Static block:
 * 1. It is used to initialize the static data member
 * 2. it is executed before main method at the time of classloading
 */
public class A2 {
    static {
        System.out.println("Static block is invoked");
    }

    public static void main(String args[]){
        System.out.println("Hello main");
    }
}
