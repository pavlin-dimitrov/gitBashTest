package com.company;

public class Movie {
    private String movieName;
    private boolean isAvailable;
    private String rentedBy;

    public Movie(String movieName){
        this.movieName = movieName;
        this.isAvailable = true;
        this.rentedBy = null;
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
