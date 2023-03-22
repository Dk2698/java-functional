package org.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    private  int fields;

    //  test lambda
    public  List<Hotel>  testLambda(){
        HotelService hotelService = new HotelService();

//        int PRICE = 200;
        final int PRICE = 200;

        FilteringCondition lambdaExp = hotel -> {
           // this.fields ; // this contex that not anonymous class and using local variable
//            PRICE++ ; // local variable must be final in  lambada expression
            return  hotel.getPricePerNight() <= PRICE;
        };
       // PRICE++; // change here outsize lambda expression
        return  hotelService.filterHotels(lambdaExp);
    }

    public  FilteringCondition  testLambda1(){
        HotelService hotelService = new HotelService();

        int PRICE = 200; // primitive

        List<Integer> arr = new ArrayList<>();
        /// arr reference variable
        FilteringCondition lambdaExp = hotel -> {
            return  hotel.getPricePerNight() <= arr.size(); // value capture
        };
        // PRICE++ not change;

        arr.add(1);
//        arr = new ArrayList<>(); // new object change

      return  lambdaExp;
    }
    public static void main(String[] args) {
        HotelService  hotelService = new HotelService();

        List<Hotel> hotels = hotelService.filterHotels(new FilterHotelsLessThan2000());// passing some condition here , first create concrete class and implement condition
        System.out.println("List of hotels price less tha 2000 " + hotels.stream().toList());



        List<Hotel> fiveStar = hotelService.filterHotels(new FilterHotelsBy5star());// passing some condition here , first create concrete class and implement condition
        System.out.println("List of hotels price less tha 2000 " + fiveStar);


        List<Hotel> fiveStar1 = hotelService.filterHotels(new FilteringCondition() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType() == HotelType.FIVE_STAR;
            }
        }); // pass anonymous inner class, no name, no create separate class
        System.out.println("List of hotels price less tha 2000 " + fiveStar);


        // convert to lambda expression
        List<Hotel> fiveStar2 = hotelService.filterHotels( (Hotel hotel) -> {
                return hotel.getHotelType() == HotelType.FIVE_STAR;
            });
        System.out.println("List of hotels price less tha 2000 " + fiveStar);


        List<Integer> list = List.of(1,2,3,4,5);
        Collections.sort(list,(Integer a, Integer b) -> {return b -a;} );

        Collections.sort(list,(a, b) ->  b -a );

        FilteringCondition lambdaExp = hotel -> hotel.getPricePerNight() <=2000;

        List<Hotel> hotels1 = hotelService.filterHotels(lambdaExp);


        Main main = new Main();
        FilteringCondition filteringCondition = main.testLambda1();
        hotelService.filterHotels(filteringCondition);
    }

    /* passing function in java
        1. create an interface
        2. instantiate a class that implements the interface
        3. implements the method of the interface, where the method body = function body which u wanted to pass as parameters
        4. pass an object of the concrete implementation of the interface
    */
    // passing function as parameter without lambda
    // in argument type remove and one parameter no need round parenthesis
    // one line statement, remove curly braces, return, semicolon

    public  static  void  exampleFunction(){
        Predicate<Integer> divisbleBy2 = (no) -> {
            return  no %2 == 0;
        };

        Predicate<Integer> divisbleBy3 = no -> no % 3 == 0;
        IntPredicate divisbleBy4 = no -> no % 4 == 0;

        Predicate<Integer> divisableBy6 = divisbleBy2.and(divisbleBy3);
        System.out.println(divisableBy6.test(6));


        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(6);

        List<Integer> list = List.of(1,2,3,4,4);
        list.forEach(consumer);

        Supplier<Double> supplier = () ->  Math.random();
        System.out.println(supplier.get());

        Function<String, Integer> strToLenMap = (string) -> string.length();


        Function<String, String> identity = (string) -> string;
        Function<String, String> identity1 = Function.identity();

        Integer kumar = strToLenMap.apply("kumar");
        System.out.println(kumar);


        Function<Integer, Integer> squares  = a -> a * a;
        Function<Integer, Integer> addOne  = a -> a + 1;
        Integer num = squares.andThen(addOne).apply(6);
        System.out.println(num);

    }
}
