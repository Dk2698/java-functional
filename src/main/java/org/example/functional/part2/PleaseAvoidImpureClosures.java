package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PleaseAvoidImpureClosures {
    public static void main(String[] args) {
        int[] factor = new int[] { 2 };

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        Stream<Integer> result = numbers.stream()
                .map(e -> e * factor[0]); //Please don't do this. This closure is not pure

        factor[0] = 0;

        result.forEach(System.out::println);
    }
}

//Java tries to proctect us. But, only when the variable is local (sadly)
//It does not proctect us from accessing mutable fields and also mutable
//objects that have local reference

