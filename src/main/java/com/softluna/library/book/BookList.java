package com.softluna.library.book;

public class BookList {
    private Book[] books;
    private int size;

    public BookList() {
        this.books = new Book[100];
        this.size = 0;
    }

    public void addBook(Book book) {
        books[size++] = book;
    }

    public Book getBook(int index) {
        if (index >= 0 && index < size) {
            return books[index];
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
