package com.learn;

public interface Container<T> {

    void add(T item);
    T get();
}