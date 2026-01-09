package org.example;

public class Movie extends LibraryItem{
    public int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + title +
                " by " + author +
                " (" + year + ") - " +
                durationInMinutes + " minutes";
    }
}
