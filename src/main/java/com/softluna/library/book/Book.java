package com.softluna.library.book;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "《" +
                name + "》，作者：" +
                 author +
                "，价格：" + price +
                "元，类型：" + type + "，状态：" + (isBorrowed ? "已借出" : "可借");
    }
}
