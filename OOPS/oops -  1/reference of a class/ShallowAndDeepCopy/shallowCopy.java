
//shallow copy java 
public class shallowCopy {

    public static void main(String[] args) {
        Student s1 = new Student("Anmol", 7);
        System.out.println(s1.name); // "Anmol"
        System.out.println(s1.roll); // 7

        Student s2 = s1; // shallow copy (reference)

        s1.roll = 20;
        System.out.println(s1.roll); // 20
        System.out.println(s2.roll); // 20

        // same with name as reference of onject is passed
    }

}

class Student {
    public String name;
    public int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
