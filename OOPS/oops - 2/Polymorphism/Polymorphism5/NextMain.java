package Polymorphism.Polymorphism5;

//instanceof in java 
public class NextMain {

    public static void main(String[] args) {

        // Movie movie = Movie.getMovie("A", "Jaws");
        // movie.watchMovie();

        // Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        // jaws.watchMovie();

        // Object comedy = Movie.getMovie("C", "Airplane");
        // Comedy comedyMovie = (Comedy) comedy;
        // comedyMovie.watchComedy();

        // var airplane = Movie.getMovie("C", "Airplane");
        // airplane.watchMovie();

        // var plane = new Comedy("Airplane");
        // plane.watchComedy();

        /////////////////////////// (3 ways of checking of the runtime type of object )
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            // casting to Comedy object here as we want to execute the method that's
            // specific to Comedy , watchComedy method.
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

        // pattern matching for instanceof operator :
        // If the JVM can identify that the object matches the type, it can extract data
        // from the object, without casting.
        // For this operator, the object can be assigned to a binding variable, which
        // here is called syfy.
        // From our example:
        // unknownObject instanceof ScienceFiction syfy
        // The variable syfy (if the instanceof method returns true) is already typed as
        // a ScienceFiction variable.

        // In the example (unknownObject instanceof ScienceFiction syfy), you are
        // checking if unknownObject is an instance of the
        // ScienceFiction class, and if so, you are using pattern matching to cast it to
        // a variable syfy of type ScienceFiction.

        ////////////////
        // output : Watching a Science Fiction Thriller!
    }
}
