package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Closures {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        List<Integer> result = numbers.stream()
                .map(e -> e * 2) // lambda expression
                .collect(toList());
        System.out.println(result);

        // lambdas are stateless  and have no external dependencies
        // in e -> e *2 , e is a parameter and 2 is a const

        int factor = 3;
        List<Integer> result2 = numbers.stream()
                .map(e -> e * factor) //closure
                .collect(toList());

        System.out.println(result2);
        //In e -> e * factor, e is the parameter, but what in the world is factor?
        //This expression has an external dependency

        //In languages that support lexical scoping, the factor is bound to
        //a variable in the defining scope of the anonymous function.

        //The compiler has to close-over the defining scope to bind factor
        //in the anonymous function to the appropriate variable

        //Because it has to close-over, such expressions are called as
        //closures.

        //A closure is a lambda expression that is bound to an external
        //(please immutable) state

        //lambdas have no external dependecies, closures depend on external (immutable) state.

        //In some languages like Groovy, we call lambdas as closures
        //In some languages like Java, we call closures as lambdas
        //But, we know the difference no matter what we call it as
    }
}
