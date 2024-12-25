package com.learn;

//  Box<T extends  Number> ,In this example,
// the type parameter T is restricted to subclasses of Number,
// so only numeric types like Integer, Double, etc., can be used.
public class Box<T extends  Number>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
