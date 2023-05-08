package com.epam.langSyntax;

public class NumberReverter {

    private int number;
    public void revert(int number) {
        int sum = 0;

        while(number != 0) {
            sum = sum * 10 + number%10;
            number /= 10;
        }

        System.out.println(sum);
    }

}
