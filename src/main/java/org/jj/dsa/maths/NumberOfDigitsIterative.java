package org.jj.dsa.maths;

import java.util.Scanner;

public class NumberOfDigitsIterative {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int digigts = countDigits(input);
        System.out.printf("Number of digits in the number %d id %d", input, digigts);
    }
}
