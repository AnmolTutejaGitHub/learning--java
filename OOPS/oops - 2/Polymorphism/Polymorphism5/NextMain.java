package Polymorphism.Polymorphism5;

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        // movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        // jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        // comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        // airplane.watchMovie();

        var plane = new Comedy("Airplane");
        // plane.watchComedy();

        /////////////////////////////////
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
        // If the JVM can identify that the object matches the type, it can extract data
        // from the object, without casting.
        // For this operator, the object can be assigned to a binding variable, which
        // here is called syfy.
        // From our example:
        // unknownObject instanceof ScienceFiction syfy
        // The variable syfy (if the instanceof method returns true) is already typed as
        // a ScienceFiction variable.

        ////////////////
        // output : Watching a Science Fiction Thriller!
    }
}
