package org.example.functional.part1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dory", "Gill","Bruce","Nemo","Darla","Marlin","Jacques");
        // var names = List.of(...) in newer version of java
        // find if our good friend Nemo is there?
        boolean found = false;
        //for (int i = 0; i < (or <=? size, count, length?); i++ or ++i
        // are low level details, verbose, error ,prone high cognitive load
        // how
        // we want something simpler

        for(String name :names){ // how
            if(name.equals("Nemo")){ // is it == or equals - how
                found = true;
                break; // how
            }
        }
        if(found){
            System.out.println("Nemo found");
        } else {
            System.out.println("Nemo not found");
        }

    }
}

//imperative style: we tell what to do and also how to do it
// often involves garbage variables(not needed from the domain or the problem
// point of view, but is used as part of the solution. For example, found, name, ...

// we often mutate variables - hard to reason, hard to make parallel
// often verbose, error prone, hard to read, hard to understand, more effort to maintain

// this, however, is the most familiar style of programming for a vast majority
// of programmers

// familiar, but not simple
// we should not confuse familiar with simple
// imperative style has more accidental complexity
// we have two kinds of complexities:
// inherent complexity which comes from the problem domain
// accidental complexity comes from the solution rather than the problem

// we should strive to reduce accidental complexities