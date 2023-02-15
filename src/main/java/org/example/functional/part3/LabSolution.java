package org.example.functional.part3;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public interface LabSolution {
    public static String getTriple(int m, int n) {
        int a = m * m - n * n;
        int b = 2 * m * n;
        int c = m * m + n * n;

        return String.format("%d %d %d", a, b, c);
    }

    public static List<String> computeTriples(int numberOfValues) {
        return Stream.iterate(2, m -> m + 1)
                .flatMap(m -> IntStream.range(1, m)
                        .mapToObj(n -> getTriple(m, n)))
                .limit(numberOfValues)
                .collect(toList());

        //.toList() directly on the Stream instead of using collect in Java 16 or newer
    }
}

/*
                         door opens and people can walk in
----------------                                             ----------------
xxxxxxxxxxxxxxx                     flatMap                  zzzzyyyyyyyyyxxxxxxxxxxxxxxx
----------------                                             ----------------
yyyyyyyyy
----------------
zzzz
----------------
 */