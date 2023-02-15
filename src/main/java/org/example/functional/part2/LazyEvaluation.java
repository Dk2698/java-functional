package org.example.functional.part2;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
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

        numbers.stream()
                .filter(LazyEvaluation::isEven) // fused
                .filter(LazyEvaluation::isGT3)  // fused
                .map(LazyEvaluation::doubleIt)  // fused
//                .findFirst() // try uncommenting this line and run
                ;

        System.out.println("Done");
    }
}

/*

Lazy evaluation is to functional programming as polymorphism is to object-oriented programming

Functional programming relies on lazy evaluation for efficiency.

Because of fusing and lazy evaluation, intermediate collections are not
created. Fewer collections, less garbage collection as well.
*/
