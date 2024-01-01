// method overloading and method signature  in java 

//Method overloading occurs when a class has multiple methods, with the same name, but the methods are declared with different parameters.
// So you can execute a method with one name, but call it with different arguments.
// Java can resolve which method it needs to execute, based on the arguments being passed, when the method is invoked.

// A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters.
// In other words, a signature is unique, not just by the method name, but in combination with the number of parameters, their types, and the order in which they are declared.
// A method's return type is not part of the signature.
// A parameter name is also not part of the signature.

// The type, order, and number of parameters, in conjunction with the name, make a method signature unique.
// A unique method signature is the key for the Java compiler, to determine if a method is overloaded correctly.
// The name of the parameter is not part of the signature, and therefore it doesn't matter, from Java's point of view, what we call our parameters.

// Parameter names are not important when determining if a method is overloaded.
// Nor are return types used when determining if a method is unique.

public class Basic {

    public static void checking(int a) {
        System.out.println("int");
    }

    public static void checking(float a) {
        System.out.println("float");
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);   //return type jo calculateScore("Anonymous", score); ki return type hai 
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }

    public static void main(String[] args) {
        checking(5); // int
        checking(5.0f); // float

        System.out.println("New score is " + calculateScore("Tim", 500)); // Player Tim scored 500 points
        // New score is 500000

        System.out.println("New score is " + calculateScore(10)); // Player Anonymous scored 10 points
        // New score is 10000
    }
}
