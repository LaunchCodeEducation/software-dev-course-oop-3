package org.example;

public class LibraryItem {

    protected String title;
    protected int year;
    protected String author;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item:" +
                title +
                " by " + author +
                " (" + year + ')';
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}
