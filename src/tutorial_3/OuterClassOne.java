package tutorial_3;

public class OuterClassOne {
    static String message = "Hello from Static Nested Class";

    // Static nested class
    static class NestedClass {
        void displayMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterClassOne.NestedClass nested = new OuterClassOne.NestedClass();
        nested.displayMessage();
    }
}
