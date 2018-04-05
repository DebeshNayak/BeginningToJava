package java_overloading;

// Overloading main()
public class TestOverloading3 {
    public static void main(String[] args) {
        System.out.println("main with String[]");
    }

    public static void main(String args) {
        System.out.println("main with String");
    }

    public static void main() {
        System.out.println("Main without args");
    }
}
