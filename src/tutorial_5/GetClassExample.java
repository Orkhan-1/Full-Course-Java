package tutorial_5;

public class GetClassExample {
    public static void main(String[] args) {
        Animal animal = new Dog();

        System.out.println(animal.getClass() == Dog.class);
        System.out.println(animal.getClass() == Animal.class);
    }
}