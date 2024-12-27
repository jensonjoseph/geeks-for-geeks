package org.jj.streams;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Log4j2
public class Main {
    public static void main(String[] args) {
        Configurator.setRootLevel(Level.INFO);
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        log.info("Input array");
        numbers.forEach(x -> log.info(x));

        log.info("Output result");
        squares.forEach(x -> log.info(x));
    }
}
