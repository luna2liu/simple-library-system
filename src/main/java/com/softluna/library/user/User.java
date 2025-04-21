package com.softluna.library.user;

import com.softluna.library.book.BookList;
import com.softluna.library.operation.IOperation;

public abstract class User {
    public String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
