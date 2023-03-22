package org.example.lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelService  hotelService = new HotelService();

        List<Hotel> hotels = hotelService.filterHotels(new FilterHotelsLessThan2000());// passing some condition here , first create concrete class and implement condition
        System.out.println("List of hotels price less tha 2000 " + hotels.stream().toList());



        List<Hotel> fiveStar = hotelService.filterHotels(new FilterHotelsBy5star());// passing some condition here , first create concrete class and implement condition
        System.out.println("List of hotels price less tha 2000 " + fiveStar);
    }

    /* passing function in java
        1. create an interface
        2. instantiate a class that implements the interface
        3. implements the method of the interface, where the method body = function body which u wanted to pass as parameters
        4. pass an object of the concrete implementation of the interface
     */
    // passing function as parameter without lambda
}
