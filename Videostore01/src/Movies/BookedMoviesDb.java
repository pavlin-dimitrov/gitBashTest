package Movies;

public class BookedMoviesDb {

    private Booking[] allBookedMovies;
    private int numOfBookedMovies;

    public BookedMoviesDb(Booking[] allBookedMovies, int numOfBookedMovies) {
        this.allBookedMovies = new Booking[7];
        this.numOfBookedMovies = 0;
    }

    public void bookMovie(Booking booking){
        allBookedMovies[numOfBookedMovies] = booking;
        numOfBookedMovies++;
    }
}
