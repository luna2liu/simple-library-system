package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要归还的书名：");
        String name = scanner.nextLine();

        for (Book book : bookList.getAllBooks()) {
            if (book.getName().equals(name)) {
                if (!book.isBorrowed()) {
                    System.out.println("这本书还没被借出去哦！");
                    return;
                }
                book.setBorrowed(false);
                System.out.println("归还成功！" + book);
                return;
            }
        }
        System.out.println("没有找到这本书.....");
    }
}
