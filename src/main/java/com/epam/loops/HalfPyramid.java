package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int l) {
        for(int i = 1; i <= l; i++) {
            for (int k = l - i; k > 0; k--)
                System.out.print(" ");

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
