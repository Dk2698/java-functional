package org.example.functinalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
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

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );
        // same as above
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number +1;
    // same as above
    static Function<Integer, Integer> multipleBy10Funtion =
            number -> number * 10;


    private static int incrementByOne(int number) {
        return  number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne +1) * numberToMultiplyBy;
    static  int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return  number + 1 * numToMultiplyBy;
    }
}
