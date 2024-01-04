package Polymorphism.Polymorphism1;

public class MovieMain {

    public static void main(String[] args) {

        // can do this
        // As Adventure is subclass of Movie class.
        // here is one example of polymorphism
        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie(); // here watchmovie method which we override on Adventure class got executed

        // This is example of polymorphism , we've declared a variable of type Movie
        // and assign it to an object that is really Adventure type of Movie.
        // And when we called watchMovie() on that, the behavior was the Adventure movie
        // behaviour.
        // it wasn't the base class behavior.
        // This is very simple example of polymorphism

        ///////////////////////////
        // output :

        // Star Wars is a Adventure film
        // .. Pleasant Scene
        // .. Scary Music
        // .. Something Bad Happens
    }
}
