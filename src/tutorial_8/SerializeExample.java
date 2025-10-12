package tutorial_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 22);

        try (FileOutputStream fileOut = new FileOutputStream("student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(s1);
            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Serialization and Deserialization in Java
 *
 * ---------------------------------------------------------------
 * 1. Serialization:
 *    - Process of converting an object into a byte stream.
 *    - Used to save object state to a file, database, or send it over a network.
 *    - Achieved using ObjectOutputStream and FileOutputStream.
 *
 * 2. Deserialization:
 *    - Process of converting a byte stream back into an object.
 *    - Achieved using ObjectInputStream and FileInputStream.
 *
 * ---------------------------------------------------------------
 * Notes:
 * 1.The class must implement java.io.Serializable interface: This is a marker interface (no methods) that tells the JVM that
 *   the class can be serialized. If a class does not implement Serializable, attempting to serialize it will throw a NotSerializableException.
 *
 * 2.static fields are NOT serialized: Belong to the class, not the object. Serialization saves the state of an object, not the class definition.
 *   Since static variables are shared across all instances, it wouldn’t make sense to store them as part of a single object’s state
 *
 * 3.transient fields are skipped during serialization: Explicitly marked to skip serialization. Usually used for sensitive
 *   or temporary data that you don’t want to persist — like passwords, session tokens, or cached values
 *
 * 4.serialVersionUID ensures compatibility during deserialization: A unique identifier for each Serializable class.
 *   It helps verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible
 *   with respect to serialization. If the receiver has a different serialVersionUID than the sender, it will throw an InvalidClassException.
 * The 1L here is your manually defined version ID.

   If you later modify the class (e.g., add/remove fields) and don’t update this number,
   the old serialized data may not be compatible with the new version.

   If you don’t specify serialVersionUID,
   Java automatically generates one based on the class’s structure (fields, methods, etc.).
   But the problem is — this auto-generated value changes every time you modify your class,
   which can break deserialization of old data
 */
