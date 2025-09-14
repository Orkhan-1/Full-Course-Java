package tutorial_3;

public class MainOne {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };
        dog.sound(); // Output: Dog barks
    }
}
