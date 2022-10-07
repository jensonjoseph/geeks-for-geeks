package org.jj.dsa.maths;

import java.util.Scanner;

public class FactorialRecursive {
    private static int factorial(int input) {
        int result;
        if (input == 0) {//break condition
            return 1;
        } else {
            result = input * factorial(input - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }
}
