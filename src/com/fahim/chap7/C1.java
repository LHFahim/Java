package com.fahim.chap7;

public class C1 {

    public static void main(String[] args) {

        int x = 1;
        int[] y = new int[10];

        m(x,y);

        System.out.println(x);
        System.out.println(y[0]);
    }

    public static void m(int x, int[] y){
        x = 1001;
        y[0] = 5555;
    }
}
