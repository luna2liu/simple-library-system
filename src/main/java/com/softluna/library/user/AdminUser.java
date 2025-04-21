package com.softluna.library.user;

import com.softluna.library.operation.AddOperation;
import com.softluna.library.operation.ExitOperation;
import com.softluna.library.operation.FindOperation;
import com.softluna.library.operation.IOperation;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);

        this.operations = new IOperation[] {
                new ExitOperation(),
                new AddOperation(),
                new FindOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=== 管理员菜单 ===");
        System.out.println("1. 添加图书");
        System.out.println("2. 查找图书");
        System.out.println("0. 退出系统");
        System.out.print("请输入你的操作编号：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
