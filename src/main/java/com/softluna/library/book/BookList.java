package com.softluna.library.book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private final List<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public int getSize() {
        return books.size();
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void removeBook(int index) {
        books.remove(index);
    }
}
