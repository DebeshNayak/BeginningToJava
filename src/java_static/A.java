package java_static;

/**
 * Restriction of static method:
 * 1. The static method can not use non static data member or call non-static method directly.
 * 2. this and super cannot be used in static context.
 */
public class A {
    int a = 40;

    public static void main(String args[]){ // static method can't use non static data member
        //System.out.println(a);
    }
}
