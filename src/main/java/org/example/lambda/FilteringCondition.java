package org.example.lambda;

@FunctionalInterface
public interface FilteringCondition {
    abstract boolean test(Hotel hotel);
    // what if we have more than 1 method in our interface
    // not figure out compiler in more abstract method , use lambda expression
//    abstract boolean test1(Hotel hotel);


}
