package com.fahim.chap11;

public class Ex5 {
    public static void main(String[] args) {

        MyDouble n1 = new MyDouble(5.8);



        System.out.println("Value is " + n1.getValue());

        System.out.println("n1 is positive? " + n1.isPositive());

        System.out.println("n1 is negative? " + n1.isNegative());



        System.out.println("10 is positive? " + MyDouble.isPositive(10));

        System.out.println("11 is negative? " + MyDouble.isNegative(11));



        MyDouble n2 = new MyDouble(9);

        System.out.println("n2 is positive? " + MyDouble.isPositive(n2));

        System.out.println("n2 is negative? " + MyDouble.isNegative(n2));

    }
}
class MyDouble {
    private double n;

    public MyDouble(double n) {
        this.n = n;
    }

    public double getValue() {
        return n;
    }

    public static boolean isPositive(MyDouble n){
        if (n.getValue() < 0) {
            return false;
        }
        return true;
    }

    public static boolean isNegative(MyDouble n){
        if(n.getValue() <0){
            return true;
        }
        return false;
    }

    public static boolean isPositive(int n){
        if (n < 0) {
            return false;
        }
        return true;
    }

    public static boolean isNegative(int n){
        if(n<0){
            return true;
        }
        return false;
    }

    public boolean isPositive(){

        if (n < 0) {
            return false;
        }
        return true;
    }

    public boolean isNegative(){
        if(n<0){
            return true;
        }
        return false;
    }
}

