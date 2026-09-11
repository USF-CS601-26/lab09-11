package interfaces.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDemo {
    static void main(String[] args) {
        Student s = new Student("Alice", 21);

        // Shows how to serialize the Student object → bytes in file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"))) {
            out.writeObject(s);
            System.out.println("Student saved.");
        }
        catch (IOException e) {
            System.out.println(e);
        }

        // TODO: Use documentation to learn how to deserialize
        // Deserialization: bytes → object
        // Hint: use ObjectInputStream and readObject() method

    }
}