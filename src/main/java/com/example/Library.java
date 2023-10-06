package com.example;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<Book>();
    }
    public void addBook(Book book){
        bookList.add(book);

    }
    public void removeBook(Book book){
        bookList.remove(book);

    }
    
    public Book findBookByISBN(String ISBN){
        for(Book book: bookList){
            if (book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }
}

    
    // TODO: Implement methods to add a book, check out a book, return a book, and find a book by ISBN

