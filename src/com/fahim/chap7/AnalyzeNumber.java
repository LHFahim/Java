
package com.fahim.chap7;

public class AnalyzeNumber {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        double[] numbers = new double[n]; // Create an array
        double sum = 0;

        System.out.print("Enter the numbers: ");

        for(double var : numbers){
            var = input.nextDouble();
            sum += var;
        }

        double average = sum / n;
        System.out.println("SUM " + sum);

        int count = 0; // The numbers of elements above average

        for(double var : numbers){
            if(var > average){
                count++;
            }
        }

        for(double var : numbers) System.out.println(var);

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is "
                + count);
    }

}