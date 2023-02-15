package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FunctionalComposition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(toList()); // reduce

        System.out.println(result);
    }
}

/*
    Functional style == Functional Composition
    pipeline of function

    source | grep ... | sed ... | ...

    A series of transformation of data
 */