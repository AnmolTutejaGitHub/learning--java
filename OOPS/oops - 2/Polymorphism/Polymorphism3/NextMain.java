package Polymorphism.Polymorphism3;

// casting with classes and using Object and var references 

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // Adventure jaws = Movie.getMovie("A", "Jaws");
        // jaws.watchMovie();
        // this code doesn't compile and gives as an
        // error -> (required type is Adventure and provided is Movie).
        // first of all , compiler isn't going to rum the code to figure out what will
        // really happen. It has to be satisfied making assumptions about the code ,
        // based on how we write our code .
        // In this case (Movie.getMovie we declared that the method is going to return a
        // Movie class . We didn't say it was going to return an instance of the
        // Adventure class. The compiler asks the question can every kind of Movie ) be
        // called an Adventure meaning can every Movie be assigned to an Adventure
        // variable ? the ans is no, the Adventure reference , jaws would not be able to
        // handle a comey movie . But we absolutely know tha when pass a variable "A" as
        // the type that we will get an Adventure movie back . But the compiler can't
        // figure that out , without executing code and it's not going to do that .
        // Now , we can give compiler more detailed instructions to get around this
        // issue . One way is to do this is by casting .

        // casting
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        // if I pass "C" in above code I will get a ClassCastException error

        /////////////////////////////

        Object comedy = Movie.getMovie("C", "Airplane");
        // comedy.watchMovie(); will give an error

        // note :
        Movie theMovie = Movie.getMovie("Science", "Star Wars");
        theMovie.watchMovie(); // will compile
        // theMovie.watchAdventure(); // will give an error
        // And this watchMovie method on theMovie will be the Overridden method bt
        // Adventure class that get's executed

        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy(); // Watching a Comedy!

        //////////////////////////////

        // var :
        // var, is a special contextual keyword in Java, that lets our code take
        // advantage of Local Variable Type Inference.
        // By using var as the type, we're telling Java to figure out the compile-time
        // type for us.

        // Local Variable Type Inference was introduced in Java 10.
        // One of the benefits is to help with the readability of the code, and to
        // reduce boilerplate code.
        // It's called Local Variable Type Inference for a reason, because:
        // It can't be used in field declarations on a class.
        // It can't be used in method signatures, either as a parameter type or a return
        // type.
        // It can't be used without an assignment, because the type can't be inferred in
        // that case.
        // It can't be assigned a null literal, again because a type can't be inferred
        // in that case.

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
