package tutorial_5;

public class InstanceofExample {
    public static void main(String[] args) {
        Animal dog = new Dog();

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);
    }
}