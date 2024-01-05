package Polymorphism.Polymorphism3;

// casting with classes and using Object and var references 

// In Java, when you have a reference variable of a base class type pointing to an object of a derived class, 
//the compiler allows you to call methods that are declared in the base class. 
//If the derived class has overridden those methods, the overridden version in the derived class will be executed at runtime. 
//This is polymorphism in action.

// However, when you call a method that is specific to the derived class and not declared in the base class, 
//you need to cast the reference variable to the derived class type before making the call.

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // In Java, when you have a reference variable of a base class type pointing to
        // an object of a derived class, the compiler allows you to call methods that
        // are declared in the base class. If the derived class has overridden those
        // methods, the overridden version in the derived class will be executed at
        // runtime. This is known as polymorphism in action.

        ////////////////////////////////////////////////////////////////
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

        // Here, you are assigning the result of Movie.getMovie("C", "Airplane") to an
        // Object reference. The watchMovie method cannot be directly called on comedy
        // because the compiler only knows that it's an Object, and Object does not have
        // a watchMovie method. If you want to call watchMovie, you would need to cast
        // comedy back to a Movie or one of its subclasses.
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

        // var --> like var in javascript //

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        // Since Movie class was declared as the return type , of the static method
        // getMovie , then java can infer the type of this variable airplane , should be
        // a Movie .
        // method ke return type dekhkar infer kiya . getMovie method ka return type
        // Movie hai .
        // Why didn't compiler infer that it was a Comedy class ? because nothing about
        // signature of the method , indicate that a comedy instance might be retured ,
        // from the method.

        var plane = new Comedy("Airplane");
        // compiler can easily infer the type Comedy
        plane.watchComedy();
    }
}
