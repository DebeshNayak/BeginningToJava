package java_static;

/**
 * Q: Can we execute a program without main() method?
 */
public class A3 {
    static {
        System.out.println("static block is invoked");
        System.exit(0);
    }
}
/**
 * In JDK7 and above, output will be:
 * Error: Main method not found in class A3, please define the main method as:
 * public static void main(String[] args)
 * or a JavaFX application class must extend javafx.application.Application
 */