package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FunctionalComposition1 {
    public  static  boolean isEven(int number){
        System.out.println("isEvent called for " + number);
        return number % 2 == 0;
    }

    public  static  boolean isGT3(int number){
        System.out.println("isGT3 called for " + number);
        return number  > 3;
    }

    public  static  int doubleIt(int number){
        System.out.println("doubleIt called for " + number);
        return number * 2;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer result = numbers.stream()
                .filter(FunctionalComposition1::isEven) // fused
                .filter(FunctionalComposition1::isGT3)  // fused
                .map(FunctionalComposition1::doubleIt) // fused
                .findFirst()
                .orElse(0);

        System.out.println(result);
    }
}

/*
Functional style == Functional composition

Functional programming == Functional composition + lazy evaluation

List               vs.            Stream
Bucket of data                Pipeline of functions

Some languages only offer functional style, that is, they provide only
functional composition. JavaScript without any external libraries.

Some languages offer functional programing, that is, they provide both
functional composition and lazy evaluation. Haskell, Java, C#, Python,...

A Stream does not call each function on every single element.

It has two types of functions: intermediate and terminal

It first fuses the functions that are part of the intermediate steps.
The fused function is run, only just enough, minimally, but only when a terminal
operation is executed.
*/