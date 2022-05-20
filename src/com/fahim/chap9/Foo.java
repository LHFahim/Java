package com.fahim.chap9;

public class Foo {

    static int i = 5;
    static int k = 9;

    public static void main(String[] args) {
        int j = i;
        m1();
    }

    public static void m1() {

        i = i+k + m2(i,k);
    }

    public static int m2(int i, int j) {

        return (int)(Math.pow(i, j));
    }
}
