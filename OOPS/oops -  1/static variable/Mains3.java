//static variables 
//Every instance of the class shares the same static variable.
//So if changes are made to that variable, all other instances of that class will see the effect of that change.

public class Mains3 {
    public static void main(String[] args) {
        Dog rex = new Dog("rex"); // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)

        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy

    }
}
