package com.softluna.library.user;

public abstract class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void showMenu();
}
