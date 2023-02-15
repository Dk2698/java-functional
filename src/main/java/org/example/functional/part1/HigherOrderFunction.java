package org.example.functional.part1;

public class HigherOrderFunction {
    public static void main(String[] args) {
        //The old Java had the ideology that everything is an object
        //Due to this ideology, we were allowed to pass only objects to functions
        //in the past.

        /*
        Thread thread = new Thread(new Runnable() { // passing object
          public void run() {
            System.out.println("In another thread");
          }
        });
        thread.start();

        System.out.println("In main");
        */

        //The new Java allows to pass functions to functions also in addition to
        //passing objects to functions
        Thread thread = new Thread(() -> System.out.println("In another thread"));
        thread.start();

        System.out.println("In main");

        //In this case, the Thread class' constructor is a higher-order function
        //since it can receive another function as its argument.
    }
}

/*
functions in general:
we can pass objects to functions
we can create objects in functions
we can return objects from functions

higher-order functions:
we can pass functions to functions
we can create functions in functions
we can return functions from functions

In addition to doing object decomposition we can also do functional decomposition
as well.

This is not a syntax sugar.

If the passing of the anonymous function to Thread's constructor were
simply a syntax sugar, then we will be creating many objects under the hood.
More objects we create, more garbage we may collect at runtime. Not good.

In this case, Java introduced a new concept called invokedynamic, which allows
us to pass function handles to functions without having to create objects to
wrap functions.
*/

