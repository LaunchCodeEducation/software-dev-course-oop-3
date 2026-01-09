package org.example;

public class Album extends LibraryItem{
    public int trackCount;

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Album: " + title +
                " by " + author +
                " (" + year +
                ") - " + trackCount + " tracks" ;
    }
}
