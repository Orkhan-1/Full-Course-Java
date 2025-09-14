package tutorial_4;

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if (animal instanceof Dog) {
            System.out.println("animal is a Dog!");
        }

        if (animal instanceof Animal) {
            System.out.println("animal is an Animal!");
        }
    }
}