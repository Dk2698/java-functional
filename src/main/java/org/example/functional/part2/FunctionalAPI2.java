package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FunctionalAPI2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        //reduce specialized
        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(toList()); // reduce
                // there are many specialized reduce operation
                // collect, sum , min ax, count, etc
        System.out.println(result);
    }
}
