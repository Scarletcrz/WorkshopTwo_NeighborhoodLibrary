package com.sc;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}

///Properties
class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String isCheckedTo;

// Constructors

    public Book( int id, String isbn,String title, boolean isCheckedOut, String isCheckedTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.isCheckedTo= isCheckedTo;
    }

// Getters and Setters
    public int id(){
        return this.id;
    }

}