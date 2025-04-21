package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("书名：");
        String name = scanner.nextLine();

        System.out.print("作者：");
        String author = scanner.nextLine();

        System.out.print("价格：");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.print("类型：");
        String type = scanner.nextLine();

        Book book = new Book(name, author, price, type);
        bookList.addBook(book);

        System.out.println("添加成功：" + book);

    }
}
