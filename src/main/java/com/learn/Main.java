package com.learn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add("Hello Nikhil");
        list.add(21);
        list.add(3.75);

        String str=(String) list.get(0);
        String s =(String) list.get(1);

    }
}