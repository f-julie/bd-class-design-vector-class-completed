package com.classmethods;

public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1,2);
        Vector b = new Vector(3,4);

        System.out.println(a.normalized());
        System.out.println(a.magnitude());
        System.out.println(b.magnitude());

        System.out.println(a.dot(b));
    }
}
