package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaTriesToProtectUs {
    public static void main(String[] args) {
        int factor = 2;

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        Stream<Integer> result = numbers.stream()
                .map(e -> e * factor); //this line will fail compilation
        //the above closure is not pure

        factor = 0;

        result.forEach(System.out::println);
    }
}

//Java tries to proctect us.
//It wants closures to depend on variables that are final or effectively final.


