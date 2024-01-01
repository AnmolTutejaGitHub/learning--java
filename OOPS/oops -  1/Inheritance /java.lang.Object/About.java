// every class you create in Java, intrinsically extends a special Java class.  
// This class is named Object, and it's in the java.lang package.
// a class called Object?

public class About extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max); // Max is 21

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8,
                "Carole");
        System.out.println(jimmy); // Carole's kid, Jimmy is 8
    }
}

// only one class in java source file can be made punlic and that is About.java
class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public String toString() {
    // return super.toString();
    // }

    @Override
    public String toString() {
        return name + " is " + age;
        // return "Student{" +
        // "name='" + name + '\'' +
        // ", age=" + age +
        // '}';
    }
}

class PrimarySchoolStudent extends Student
// can't do :
// class PrimarySchoolStudent extends Student,Object
// will give error as can't extend to more than one class explicitly
// The inheritance is cumulative tree meaning that PrimarySchoolStudent inherits
// both Student members and Object members

{

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }

}
