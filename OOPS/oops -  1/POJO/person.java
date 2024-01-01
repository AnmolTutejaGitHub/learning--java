// pojo brief description 
// this class is not related to the two in same folder 

//A POJO, which stands for Plain Old Java Object, is a Java class that encapsulates business logic 
//and data without requiring any frameworks or extensions. It is a simple class with private fields, 
//public getter and setter methods, and may include additional methods for business logic.
// POJOs are often used in Java development to represent data objects and are not tied to any specific framework.

package POJO;

public class person {
    // Private fields
    private String firstName;
    private String lastName;
    private int age;

    // Constructors
    public person() {
        // Default constructor
    }

    public person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Additional methods (business logic) can be added here

    @Override
    public String toString() {
        return "person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}

// In this example, person is a POJO with private fields (firstName, lastName,
// and age), constructors, getter and setter methods, and an overridden toString
// method for a string representation of the object.

// POJOs are often used as data transfer objects, domain objects, or entities in
// various Java applications. They follow the principles of simplicity and
// readability without being tied to any specific framework or technology. This
// makes them easy to understand, maintain, and test.
