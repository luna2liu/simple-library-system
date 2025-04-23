package com.softluna.library.user;

import com.softluna.library.operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);

        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=== 普通用户菜单 ===");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("4. 显示图书列表");
        System.out.println("0. 退出系统");
        System.out.print("请输入你的操作编号：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
