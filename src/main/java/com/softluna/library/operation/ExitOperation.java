package com.softluna.library.operation;

public class ExitOperation implements IOperation{
    @Override
    public void work() {
        System.out.println("再见，欢迎下次使用！");
        System.exit(0);
    }
}
