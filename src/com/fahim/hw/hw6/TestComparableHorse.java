package com.fahim.hw.hw6;

public class TestComparableHorse {
    public static void main(String[] args) {

        ComparableHorse Horse1 = new ComparableHorse(8.1);
        ComparableHorse Horse2 = new ComparableHorse(7.6);

        if(Horse1.compareTo(Horse2) == 1)
            System.out.println("Horse1 is heavier than Horse2");
        else if(Horse1.compareTo(Horse2) == -1)
            System.out.println("Horse1 is lighter than Horse2");
        else
            System.out.println("Horse1 and Horse have the same weight");
    }
}


class ComparableHorse extends Animal implements Comparable<ComparableHorse> {
    private double weight;

    public ComparableHorse() {

    }

    @Override
    public double getWeight() {
        return weight;
    }

    public ComparableHorse(double weight) {

        this.weight = weight;
    }

    public void printHorse() {

        System.out.println("The Horse is created " + getDateCreated() +
                " the weight is " + weight);
    }

    @Override
    public int compareTo(ComparableHorse o) {
        if(this.weight > o.weight)return 1;
        else if (this.weight < o.weight)return -1;
        else return 0;
    }
}

abstract class Animal {
    private String color = "white";
    private java.util.Date dateCreated;

    protected Animal() {
        dateCreated = new java.util.Date();
    }

    protected Animal(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color;
    }

    public abstract double getWeight();
}
