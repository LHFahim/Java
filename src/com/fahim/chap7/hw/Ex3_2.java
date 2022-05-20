package com.fahim.chap7.hw;

public class Ex3_2 {

    public static void main(String[] args) {

        int cnt  = 0, div = 10;

        for(int i=100; i<1000; i++){

            if( i % 5 == 0 & i % 6 == 0){
                if(cnt % div == 0) System.out.println("\n");
                System.out.print(i + " ");
                cnt++;
            }
        }

        nPrint("dumbass", 4);
    }

    static void nPrint(String message, int n) {

        while (n > 0) {

            System.out.print(message);

            n--;

        }

    }
}
