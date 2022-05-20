package com.fahim.chap9.hw4;

import java.util.Date;

public class One {

    public static void main(String[] args) {


        //10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000};

        Date date = new Date();

        long[] arr = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};


        for (int i = 0; i < arr.length; i++) {
            date.setTime(arr[i]);
            System.out.println(date.toString());
            System.out.println();
        }
    }
}
