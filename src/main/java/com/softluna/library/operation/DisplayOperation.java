package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("== 显示图书列表 ==");
        int size = bookList.getSize();
        if (size == 0) {
            System.out.println("当前没有图书！");
            return;
        }

        for (int i = 0; i < size; i++) {
            Book book = bookList.getBook(i);
            System.out.println((i + 1) + ". " + book);
        }
    }
}
