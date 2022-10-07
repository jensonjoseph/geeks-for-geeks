package org.jj.dsa.maths;

import java.util.Scanner;

public class NumberOfDigitsRecursion {
    public static int countDigit(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = countDigit(input);
        System.out.printf("Number of digits in %d = %d%n", input, output);
    }
}
