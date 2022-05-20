package com.fahim.chap9.hw4;

public class ThirdMain {

    public static void main(String[] args) {

        Rabbit h1 = new Rabbit("h1", 5.6);
        Rabbit h2 = new Rabbit("h2", 3.4);

        System.out.println("the first rabbit's name: " + h1.getName());
        System.out.println("the first rabbit's weight: " + h1.getWeight());
        System.out.println("the second rabbit's name: " + h2.getName());
        System.out.println("the second rabbit's weight: " + h2.getWeight());

        System.out.println("sum of the two rabbits' weight: " + ((double)h1.getWeight() + (double)h2.getWeight()));

        h1.setWeight(7.8);

        System.out.println("the first rabbit's name: " + h1.getName());
        System.out.println("the first rabbit's weight: " + h1.getWeight());
        System.out.println("the second rabbit's name: " + h2.getName());
        System.out.println("the second rabbit's weight: " + h2.getWeight());

        System.out.println("sum of the two rabbits' weight: " + ((double)h1.getWeight() + (double)h2.getWeight()));
    }
}
