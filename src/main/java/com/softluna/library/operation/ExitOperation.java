package com.softluna.library.operation;

import com.softluna.library.book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("再见，欢迎下次使用！");
        System.exit(0);
    }
}
