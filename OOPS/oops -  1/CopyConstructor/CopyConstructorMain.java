public class CopyConstructorMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anmol";
        s1.roll = 7;
        s1.password = "abc";

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    // shallow copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

}
