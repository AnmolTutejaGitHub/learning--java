class globalvariable {
    static int age;// My age is 0 years // if declared in class level it will have default value of
                   // zero

    public static void main(String[] args) {
        // int age; // if declared inside main method then it is unintialised and does
        // not have// default value. if uninitialsied then show error
        int age = 27; // My age is 27 years
        // if age is declared at class level and in main method the declaration if age
        // say here is 27 will be considered
        System.out.println("My age is " + age + " years");
    };
}

// note : we can declare int $age;
// int _age; in java
// int myAge; camelCasing (convention) //variable declaration
