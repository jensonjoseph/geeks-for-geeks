package org.jj.dsa.maths;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("%d is Palindrome? : %b", input, isPalindrome(input));
    }

    private static boolean isPalindrome(int input) {
        int reverse = reverse(input);
        return input == reverse;
    }

    private static int reverse(int input) {
        int mod = 0;
        int reverse = 0;
        while (input > 0) {
            mod = input % 10;
            input = input / 10;
            reverse = (reverse * 10) + mod;
        }
        return reverse;
    }

}
