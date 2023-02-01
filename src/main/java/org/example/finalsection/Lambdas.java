package org.example.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String>  uppercaseName= name -> name.toUpperCase();

        Function<String, String>  uppercaseName1= name ->{
            // logic
            if(name.isBlank()) throw  new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String,Integer, String>  upperCaseName= (name, age) ->{
            if(name.isBlank()) throw  new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex0", 20));

        Integer number = null;
        // primitive not use here
        int counter = 0;


    }
}
