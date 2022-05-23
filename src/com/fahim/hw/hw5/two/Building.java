package com.fahim.hw.hw5.two;

public class Building {

    private String name;
    private String location;
    private static String material = "cement";
    private int age;


    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getClass().getSimpleName()+": "+ getName();
    }

//    public String toString() {
//        return "Building{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
