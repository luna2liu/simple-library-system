package com.softluna.library.user;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
    }

    @Override
    public void showMenu() {
        System.out.println("普通用户菜单：1.查找图书 2.借阅图书 ...");
    }
}
