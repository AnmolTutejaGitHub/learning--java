package Polymorphism.Polymorphism2;

import java.util.Scanner;

public class MovieMain {

    public static void main(String[] args) {

        // // uncomment to see use of getMovie method (it has return type Movie)
        // Movie theMovie = Movie.getMovie("Science", "Star Wars"); //polymophism
        // // was able to do Movie.getMovie() as I made getMovie method static
        // theMovie.watchMovie(); //polymorphism

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}

// That was polymorphism in action.
// It's the ability to execute different behavior, for different types, which
// are determined at runtime.
// And yet we did it with just two statements, in the main method, as shown
// here.

// Movie theMovie = Movie.getMovie("Science", "Star Wars"); //polymophism
// theMovie.watchMovie();

// Polymorphism enables you to write generic code, based on the base class, or a
// parent class.
// And this code, in the main method, is extendable, meaning it doesn't have to
// change, as new subclasses become available.
// This code can handle any instances that are a Movie, or a subclass of movie,
// that are returned from the factory method.

/////////////////////////

// The code demonstrates runtime polymorphism, also known as dynamic
// polymorphism. In Java, dynamic polymorphism is achieved through method
// overriding. In this case, the watchMovie method is overridden in the
// subclasses Adventure, Comedy, and ScienceFiction, providing different
// implementations for each subclass.

// The key elements of dynamic polymorphism in this code are:

// The base class Movie has a method watchMovie.
// The subclasses Adventure, Comedy, and ScienceFiction extend the base class
// Movie and override the watchMovie method with their own implementations.
// The getMovie factory method returns an instance of the appropriate subclass
// based on the input type.
// At runtime, when the watchMovie method is called on an object of type Movie,
// the actual implementation that gets executed is determined by the type of the
// object at runtime. This allows for flexibility and extensibility in handling
// different types of movies without modifying the generic code in the MovieMain
// class.

// In summary, the code utilizes runtime polymorphism to achieve dynamic
// behavior based on the actual types of objects during runtime.