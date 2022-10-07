package org.jj.dsa.intro;

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = sumOfNaturalNumbers(num);
        System.out.println("Result is : " + res);
    }

    private static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
