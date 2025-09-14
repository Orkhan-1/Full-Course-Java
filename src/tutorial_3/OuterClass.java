package tutorial_3;

public class OuterClass {
    private String message = "Hello from Outer Class";

    // Non-static inner class
    class InnerClass {
        void displayMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMessage();
    }
}
