package enums;

// instead of creating a class called Status and create multiple objects we can create enum (If want constants?)
enum Status {
    Running, Failed, Pending, Success;
}
// Status is also a class (enum is a class) and Running , Failed , Pending ,
// Success are named constants
// Running , Failed , Pending , Success are objects of class enum

public class Basic {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running; // Running is object assigned to s
        // Status --> type

        System.out.println(s); // Running

        // Status s = Status.NoIdea; // error

        // note order of Running is 0 , Failed is 1 , Pending is 2 , Success is 3
        Status o = Status.Failed;
        System.out.println(o.ordinal()); // 1 // .ordinal method gives status
        // as Status (enum) is a class we got some methods on it

        // We can also print all
        Status[] ss = Status.values(); // as .values() method gives arrray
        for (Status a : ss) {
            System.out.println(a); // Running
            // Failed
            // Pending
            // Success

        }
    }

}
