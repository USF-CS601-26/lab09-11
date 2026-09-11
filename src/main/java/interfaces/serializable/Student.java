package interfaces.serializable;

import java.io.Serializable;

// Serializable is a *marker interface*: it has NO methods. We are telling Java:
// the object of this class can be written to bytes for saving / transfer.
class Student implements Serializable {
    // serialVersionUID identifies the version of a serializable class so Java can check
    // whether a saved object is compatible with the current version of the class.
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
