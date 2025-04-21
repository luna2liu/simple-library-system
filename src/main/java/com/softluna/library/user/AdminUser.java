package com.softluna.library.user;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void showMenu() {
        System.out.println("管理员菜单：1.添加图书 2.删除图书 ...");
    }
}
