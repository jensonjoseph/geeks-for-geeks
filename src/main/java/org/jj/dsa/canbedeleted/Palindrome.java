package org.jj.dsa.canbedeleted;

import java.util.Scanner;

public class Palindrome {
    private static int reverse(int input) {
        int mod;
        int reverse = 0;
        while (input > 0) {
            mod = input % 10;
            input = input / 10;
            reverse = (reverse * 10) + mod;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("Reverse of %d id %d",input,reverse(input));
    }
}
