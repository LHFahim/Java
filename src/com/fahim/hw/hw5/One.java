package com.fahim.hw.hw5;

import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        Integer number = scanner.nextInt();
        while (number.intValue() != 0) {
            list.add(number);
            number = scanner.nextInt();
        }

        System.out.println("The minimum number is " + min(list));
    }

    /** Return the maximum value in an ArrayList of integers */
    public static Integer min(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;

        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }

}
