package org.example.functional.part1;

public class LambdaExpression {
    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> System.out.println("hello")
        );
    }
}
 /* lambdas or lambda expressions - anonymous functions
         they have no name
         take a paramters list
         have body
         return type is inferred
        (paramter list) -> body
*/