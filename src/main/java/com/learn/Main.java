package com.learn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //creating object of type of Box class
        Box<Integer> box=new Box<>(); // Box is now type-safe
        box.setValue(1);  // No issue, it's an Integer
        Integer i=box.getValue();   // No casting needed
        System.out.println(i);
    }
}