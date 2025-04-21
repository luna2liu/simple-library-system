package com.softluna.library;

import com.softluna.library.book.BookList;
import com.softluna.library.login.Login;
import com.softluna.library.user.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎使用简易图书管理系统！");
        // 登录模块 & 菜单系统等即将来袭
        User user = Login.login();
        System.out.println("登陆成功，欢迎：" + user.getClass().getSimpleName() + " " + user.name);

        BookList bookList = new BookList();

        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}