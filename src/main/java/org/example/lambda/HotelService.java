package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public  HotelService(){
        hotels.add(new Hotel(2000,2 , HotelType.THREE_STAR));
        hotels.add(new Hotel(1000,2 , HotelType.THREE_STAR));
        hotels.add(new Hotel(10000,4 , HotelType.FOUR_STAR));
        hotels.add(new Hotel(20000,5 , HotelType.FIVE_STAR));
        hotels.add(new Hotel(5000,3 , HotelType.FOUR_STAR));
        hotels.add(new Hotel(3000,3 , HotelType.THREE_STAR));
    }
//    private boolean isHotelLessThan(int price, Hotel hotel) {
//        return  hotel.getPricePerNight() <= price;
//    }
//
//    private boolean isHotel5star(Hotel hotel) {
//        return  hotel.getHotelType() ==  HotelType.FIVE_STAR;
//    }
//    public  List<Hotel> filterHotelsLessThan(int price){
//        List<Hotel> filterHotels = new ArrayList<>();
//
//        for (Hotel hotel: hotels){
//            if(isHotelLessThan(price, hotel))
//                filterHotels.add(hotel);
//        }
//        return  filterHotels;
//    }
//
//    public  List<Hotel> filterHotelsBy5star(int price){
//        List<Hotel> filterHotels = new ArrayList<>();
//
//        for (Hotel hotel: hotels){
//            if(isHotel5star(hotel)) // both filter logic is almost same, only filter condition change
//                filterHotels.add(hotel);
//        }
//        return  filterHotels;
//    }
    // code duplicate because , multiple filter having
    // only create generic filter method. passing function as parameters


    //  creating interface to pass function -> FilteringCondition
    public  List<Hotel> filterHotels(FilteringCondition filteringCondition){ // some filtering  function passing
        List<Hotel> filterHotels = new ArrayList<>();

        for (Hotel hotel: hotels){
            if((filteringCondition.test(hotel)) )  // call here filtering function as passing  parameter
                filterHotels.add(hotel);
        }
        return  filterHotels;
    }

}
