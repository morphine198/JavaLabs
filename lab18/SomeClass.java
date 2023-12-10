package edu.lab18;

import java.io.Serializable;

public class SomeClass<T extends Comparable, V extends Serializable & Animal, K> {
    private T t;
    private V v;
    private K k;

    public SomeClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }
}
