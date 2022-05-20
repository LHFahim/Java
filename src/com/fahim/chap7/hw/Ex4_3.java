package com.fahim.chap7.hw;

import java.util.Scanner;

public class Ex4_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] cnt = giveMeCounts();

        for (int i = cnt.length - 1; i >= 0; i--) {
            System.out.println("Count for " + i + " is " + cnt[i]);
        }

    }

    private static int[] giveMeCounts() {

        int[] cnt = new int[6];
        int n;

        for (int i = 0; i < 10; i++) {
            n = scanner.nextInt();
            cnt[n]++;
        }

        return cnt;
    }

}
