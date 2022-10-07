package org.jj.dsa.maths;

import java.util.Scanner;

public class FactorialIterative {
    private static int factorial(int input) {
        int result = 1;
        for (int i = 2; i <= input; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }
}
