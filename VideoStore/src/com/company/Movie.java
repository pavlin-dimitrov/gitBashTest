package com.company;

public class Movie {
    private String movieName;
    private boolean isAvailable;

    public Movie(String movieName){
        this.movieName = movieName;
        this.isAvailable = true;
    }
    public void bookIt(){
        isAvailable = false;
    }

    public void returnMovie(){
        isAvailable = true;
    }

    public String getMovieName() {
        return movieName;
    }
    public String getDetails() {
        return movieName + " " + isAvailable;
    }

}
