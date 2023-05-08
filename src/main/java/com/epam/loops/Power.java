package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int n = numberToPrint;
        while(power != 1) {
           numberToPrint *= n;
           power -= 1;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
