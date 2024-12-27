package org.jj.dsa.canbedeleted;

import java.util.Scanner;

public class NumberOfDigitsRecursive {

    public static int countNumbers(int number) {
        //exit  condition
        if (number == 0) {
            return 0;
        } else {
            //recursive call
            return 1 + countNumbers(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = countNumbers(number);
        System.out.println("Number of digits in " + number + " is " + result);

    }
}
