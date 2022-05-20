package com.fahim.chap2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weightOne = scanner.nextDouble();
        double priceOne = scanner.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weightTwo = scanner.nextDouble();
        double priceTwo = scanner.nextDouble();

        if(priceOne < priceTwo)System.out.println("Package 1 has a better price.");
        else System.out.println("Package 2 has a better price.");
    }
}
