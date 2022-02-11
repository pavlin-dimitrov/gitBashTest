package Movies;

import auth.Client;

public class Booking {

    private Movie movie;
    private Client client;

    public Booking(Movie movie, Client client) {
        this.movie = movie;
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }
}
