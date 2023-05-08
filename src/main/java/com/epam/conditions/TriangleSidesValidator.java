package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double a, double b, double c) {
        boolean check = a + b > c && b + c > a && a + c > b;

        System.out.println(check ? "this is a valid triangle" : "it's not a triangle");
    }

}
