package com.learn;

//    These type parameters are placeholders that are replaced with specific types when the class is instantiated.
//    private T value;
public class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
