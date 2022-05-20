package com.fahim.chap7.hw;

import java.util.Scanner;

public class Ex4_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[10];

        for (int i = 0; i < 10; i++)arr[i] = scanner.nextDouble();

        System.out.print("The reversal of the input is ");
        for(int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] +" ");
        //System.out.println("\n");
    }

}
