package org.example.functional.part2;

public class PureFunction {
    public static void main(String[] args) {
        //lambdas must be pure
        //If a function is not pure, then lazy evaluation will produce incorrect
        //result. Code will be hard to reason and the results may surprise the
        //reader of the code.

        /*
        A pure function is idempotent
        A pure function has no side-effects

        1. Function does not change anything that is visible outside
        2. Function does not depend on anything outside that may possibly change

        Please see the example in Kotlin
        */
    }
}
