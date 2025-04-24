package com.softluna.library.util;

import com.softluna.library.book.BookList;

import java.io.*;

public class FileIOUtil {
    private static final String FILE_NAME = "books.dat";

    public static void save(BookList bookList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(bookList);
            System.out.println("图书列表已保存到文件！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BookList load() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("没找到图书数据文件，创建新的 BookList! ");
            return new BookList();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (BookList) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new BookList();
        }
    }
}
