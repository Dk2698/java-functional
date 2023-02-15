package org.example.functional.part1;

import java.util.Arrays;
import java.util.List;

public class Declarative {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dory", "Gill","Bruce","Nemo","Darla","Marlin","Jacques");

        // find if our good friend Nemo is there?
        if(names.contains("Nemo")){
            System.out.println("Nemo found");
        }else{
            System.out.println("Nemo  not found");
        }
    }
}
// declarative style : we tell what to do but "not* how to do it
// we delegate to the underlying libraries of code for the how and we foucs
// on what - we work with higher level of abstraction

// how does contains do its work?

//I don't care
//it is encapsulation

//what if we really need to know that for different reasons?

//we can see if if we like, no problem.

//In the imperative style the details are on your face, whether you like it
//or not. In the declarative style, the details are hidden behind a function
//and it is not on your face, but is available for you to look at with one
//stroke of a key or a mouse click.

//it follows the SLAP - single level of abstraction principle
//Our code focuses on one level of detail and the contains focuses on
//a lower level of detail - SLAP

//code has fewer garbage variable and fewer explicit mutations

//code is easier to read, understand, maintain, and modify

//Examples of declarative style: CSS, XSLT, SQL ...

//it has less accidental complexity
