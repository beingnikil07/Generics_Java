package com.learn;

public class Test {

    public static void main(String[] args) {
        Pair<String ,Integer> pair=new Pair<>("age",21);
        System.out.println(pair.getKey()+"  \n"+ pair.getValue());
    }
}
