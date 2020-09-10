package ru.mirea.lab01var2;

import java.lang.*;

public class Counter {

    private String [] arguments;

    public Counter(String [] ar) {
        arguments = ar;
    }

    void printArgs() {
        for (int i=0;i<arguments.length; i++)
        {
            System.out.println(arguments[i]);
        }
    }
}
