package com.fahim.chap7.hw;

import java.util.Scanner;

public class Ex4_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();

        System.out.println("Sum of row " + n + " is " + sumRow(matrix, n));
    }

    public static int sumRow(int[][] matrix, int n) {

        int sum = 0;


        for (int j = 0; j < matrix[n].length; j++) {
            sum += matrix[n][j];
        }


        return sum;
    }

}
