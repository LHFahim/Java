package com.fahim.chap7;

public class C3 {

    public static void main(String[] args) {

        int[] x = {1,2,3};



        for(int temp : x) System.out.println(temp);

    }

    public static void m(int[] y){
        int[] res = new int[y.length];

        for(int i=0, j= res.length - 1; i< y.length; i++, j--){
            res[j] = y[i];
        }


    }
}
