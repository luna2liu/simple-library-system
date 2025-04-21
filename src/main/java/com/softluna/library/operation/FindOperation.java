package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书名关键字：");
        String keyword = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().contains(keyword)) {
                System.out.println("找到图书：" + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("没有找到匹配的图书。");
        }
    }
}
