package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;

public class FunctionalAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        // internal iteration
        numbers.forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);

        //filter
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);


        //map
        numbers.stream()
                .map(number -> number * 2.0)
                .forEach(System.out::println);


        //reduce
        int result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .reduce(0,(total, number) -> total + number);
        System.out.println(result);
    }
}
//filter takes a predicate and passes along only the values that satisify the predicate

// 0 <= # of elements in the output <= # of elements in the input

//the output is a subset of the input - no new elements in the output

//From the collection, allow only those elements that satisify the predicate to pass through

/*
map takes a function as its argument

# of elements in the output == # of elements in the input

output values may be different than the input values
output types may be different than the input types

Stream<Integer>.map(Function<Integer, Double>) ===> Stream<Double>

Given [x1, x2, x3, ..., xn]
and
yi = f(xi)

[x1, x2, x3, ..., xn].map(f) ===> [y1, y2, y3, ..., yn]
*/

/*
       filter (%)       map (* 2)           reduce (+)

x1         |                                0
----------------------------------------------\-----------------
x2 -----------------------> * 2 ----> y2  ---> +
------------------------------------------------\---------------
x3         |                                     \
--------------------------------------------------\-------------
x4 -----------------------> * 2 ----> y4  ------>  +
----------------------------------------------------\-----------
x5         |                                         \
------------------------------------------------------\---------
x6 -----------------------> * 2 ----> y6  -----------> +
                                                        \
							 ---> output

          ei
	  |
	  |
	  v
   -----> op  ----->
     ^          |
     |          |
     -----------


    1 2 3 4 5 6
filter
      2    4   6
map
      4    8   12
reduce
      |    |    |
0 ->  + -> + -> + -> 24

reduce is also called as fold (foldLeft), aggregate, inject, etc. in different
languages.
*/