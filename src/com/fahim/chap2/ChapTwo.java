package com.fahim.chap2;

public class ChapTwo {

    public static void main(String[] args) {

        int num = 123;
        getDigits(num);
    }

    public static void getDigits(int num){ // 1

        int rem;

        if( num == 0)return;
        rem = num % 10; // 1

        getDigits(num / 10); //1
        System.out.println(rem);
    }
}
