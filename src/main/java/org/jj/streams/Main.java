package org.jj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
z
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("Input array");
        numbers.forEach(x -> System.out.println(x));

        System.out.println("Output result");
        squares.forEach(x -> System.out.println(x));
    }
}
