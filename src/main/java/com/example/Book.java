package com.example;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean checkedOut;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.checkedOut = false;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public Boolean isCheckedOut(){
        return this.checkedOut;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void setISBN(String newISBN){
        this.ISBN = newISBN;
    }
    public void isCheckedOut(Boolean newCheckOut){
        this.checkedOut = newCheckOut;
    }
    
    // Book book = new Book("Sample Title", "Sample Author", "1234567890");
    // book.getTitle()
    // TODO: Implement getters, setters, and any other methods you find necessary

}
