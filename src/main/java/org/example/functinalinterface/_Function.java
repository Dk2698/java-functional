package org.example.functinalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int   increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multipleBy10 = multipleBy10Funtion.apply(increment2);
        System.out.println(multipleBy10);

        // chaining
        Function<Integer, Integer>  addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Funtion);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number +1;
    // same as above
    static Function<Integer, Integer> multipleBy10Funtion =
            number -> number * 10;


    private static int incrementByOne(int number) {
        return  number + 1;
    }
}
