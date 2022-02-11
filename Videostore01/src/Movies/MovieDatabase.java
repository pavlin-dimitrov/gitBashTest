package Movies;

public class MovieDatabase {

    private Movie[] movies;

    public MovieDatabase() {
        this.movies = new Movie[] {
                new Movie("The Shawshank Redemption"),
                new Movie("The Godfather"),
                new Movie("The Godfather: Part II"),
                new Movie("The Dark Knight"),
                new Movie("12 Angry Men"),
                new Movie("Schindler's List"),
                new Movie("The Lord of the Rings: The Return of the King")
        };
    }
}
