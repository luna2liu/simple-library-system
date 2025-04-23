package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要借阅的书名：");
        String name = scanner.nextLine();

        for (Book book : bookList.getAllBooks()) {
            if (book.getName().equals(name)) {
                if (book.isBorrowed()) {
                    System.out.println("这本书已经被借出啦！");
                    return;
                }
                book.setBorrowed(true);
                System.out.println("借阅成功！" + book);
                return;
            }
        }
        System.out.println("没找到这本书.....");
    }
}
