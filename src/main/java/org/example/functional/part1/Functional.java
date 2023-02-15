package org.example.functional.part1;

import java.util.Arrays;
import java.util.List;

public class Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //compute the total of double of even numbers

        //imperative style
        int result = 0;
        //external iterator where we control the iteration, step by step,
        // using things like continue and break, etc.
        for(int e: numbers) {
            if(e % 2 == 0) {
                result += e * 2;
            }
        }

        System.out.println(result);

        //functional style
        //Stream is an internal iterator where the flow of control is on autopilot.
        //We focus on what to do for each element and the iteration is taken care
        //for us.

        int result2 = numbers.stream() //internal iterator
                .filter(e -> e % 2 == 0) //functional: declarative + higher-order function
                .mapToInt(e -> e * 2)// functional: declarative + higher-order function
                .sum(); //declarative

        System.out.println(result2);
    }
}

//functional style == declarative style + higher-order functions

//not all declarative style are functional, but all functional style are
//declarative.

//Stream<T> has a map to get back a Stream<T>.
//Given a Stream of Dog, Book, People, etc. it makes no sense to call sum
//But, IntStream has a sum function, so does LongStream and DoubleStream.
//Stream<T>.map(...) ===> Stream<T> (we can't call sum on this one)
//Stream<T>.mapToInt(...) ===> IntStream (we can call sum on this one)

//In functional style of programming we often use what is called the
//collection pipeline pattern.



/*
Think declarative
and
Think about the problem as a series of transformations of data


source | grep someword | sed ... | wc -l
source | filter        | map     | reduce
air    | purifier      | heater  | ...
water  | purifier'     | cooler  | ...
*/