package com.softluna.library.login;

import com.softluna.library.user.*;

import java.util.Scanner;

public class Login {
    public static User login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的名字：");
        String name = scanner.nextLine();

        System.out.println("请选择你的身份：1. 管理员 2. 普通用户");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }
}
