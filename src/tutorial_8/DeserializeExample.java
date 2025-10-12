package tutorial_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student s2 = (Student) in.readObject();
            System.out.println("Deserialized Student:");
            System.out.println("Name: " + s2.name);
            System.out.println("Age: " + s2.age);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
