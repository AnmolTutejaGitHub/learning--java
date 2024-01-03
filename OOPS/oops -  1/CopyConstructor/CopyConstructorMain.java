
public class CopyConstructorMain {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Anmol";
        s1.roll = 7;
        s1.password = "abc";

        Students s2 = new Students(s1);
        System.out.println(s2.name); // Anmol
        System.out.println(s2.roll); // 7

        s1.roll = 10;
        System.out.println(s2.roll); // 7
        System.out.println(s1.roll); // 10

        s1.name = "anmol";
        System.out.println(s2.name); // Anmol wtf deep copy ??????

        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        // System.out.println(s1.marks[0]);

    }
}

class Students {
    String name;
    int roll;
    String password;
    int marks[];

    Students() {
    }

    Students(String name) {
        marks = new int[3];
        this.name = name;
    }

    Students(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // copy constructor
    // shallow copy of marks array
    // deep copy of name and roll
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    // Students(Students s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

}
