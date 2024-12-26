package com.learn;

public class Test2 {

    public static void main(String[] args) {
            Test2 obj=new Test2();
            Integer[] arr={1,2,3,4};
            String[] str={"Nikhil","Kumar","Rana"};
            obj.printArray(arr);
            obj.printArray(str);
    }

    //Generic Method
    public <T> void printArray(T[] arr){
        for(T element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
