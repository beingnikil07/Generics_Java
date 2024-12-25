package com.learn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //creating object of type of Box class
        Box box=new Box();
        box.setValue(1);
        String i=(String) box.getValue();   //Exception occur in runtime
        System.out.println(i);
    }
}