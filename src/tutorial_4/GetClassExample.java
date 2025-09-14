package tutorial_4;

public class GetClassExample {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if (animal.getClass() == Dog.class) {
            System.out.println("animal is exactly a Dog!");
        }

        if (animal.getClass() == Animal.class) {
            System.out.println("animal is exactly an Animal!");
        } else {
            System.out.println("animal is NOT exactly an Animal");
        }
    }
}