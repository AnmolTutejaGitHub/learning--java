package POJO;

public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    // In Java, the toString method is a method of the Object class, and it is
    // commonly overridden in classes to provide a meaningful string representation
    // of objects.
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    //// Annotation //////
    // Annotations are a type of metadata.
    // Metadata is a way of formally describing additional information about our
    // code.
    // Annotations are more structured, and have more meaning, than comments.
    // This is because they can be used by the compiler, or other types of
    // pre-processing functions, to get information about the code.
    // Metadata doesn't effect how the code runs, so this code will still run, with
    // or without the annotation.

    //// overridden method ////
    // An overridden method, is not the same thing as an overloaded method.
    // An overridden method is a special method in Java, that other classes can
    // implement, if they use a specified method signature.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
