package com.softluna.library.operation;

import com.softluna.library.book.Book;
import com.softluna.library.book.BookList;

import java.util.List;
import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的书名：");
        String name = scanner.nextLine();

        List<Book> books = bookList.getAllBooks();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                System.out.println("确认删除：" + books.get(i));
                System.out.print("确认？（y/n）：");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    bookList.removeBook(i);
                    System.out.println("删除成功！");
                } else {
                    System.out.println("取消删除。");
                }
                return;
            }
        }
        System.out.println("没找到这本书......");
    }
}
