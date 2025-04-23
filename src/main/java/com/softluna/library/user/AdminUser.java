package com.softluna.library.user;

import com.softluna.library.operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);

        this.operations = new IOperation[] {
                new ExitOperation(),
                new AddOperation(),
                new FindOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=== 管理员菜单 ===");
        System.out.println("1. 添加图书");
        System.out.println("2. 查找图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书列表");
        System.out.println("0. 退出系统");
        System.out.print("请输入你的操作编号：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
