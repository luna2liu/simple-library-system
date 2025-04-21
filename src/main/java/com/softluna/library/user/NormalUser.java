package com.softluna.library.user;

import com.softluna.library.operation.ExitOperation;
import com.softluna.library.operation.FindOperation;
import com.softluna.library.operation.IOperation;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);

        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=== 普通用户菜单 ===");
        System.out.println("1. 查找图书");
        System.out.println("0. 退出系统");
        System.out.print("请输入你的操作编号：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
