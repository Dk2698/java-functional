package org.example.functional.part3;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        //If you have a one-to-one function, then
        //Stream<T>.map(f11) => Stream<R>

        List<Integer> result1 = numbers.stream()
                .map(e -> e * 2)
                .collect(toList());

        System.out.println(result1);


        //If you have a one-to-many function, then
        //Stream<T>.map(f1n) => Stream<List<R>>
        List<List<Integer>> result2 = numbers.stream()
                .map(e -> Arrays.asList(e - 1, e + 1))
                .collect(toList());

        System.out.println(result2);

        //If you want a list of list as output, then map is great, use it.

        //If you want a list of elements and you have a one-to-many function, then
        //use flatMap to transform a list to a list
        List<Integer> result3 = numbers.stream()
                .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
                .collect(toList());

        System.out.println(result3);


        //if you have a one-to-one function, use map
        //if you have a one-to-many function, use flatMap
    }
}