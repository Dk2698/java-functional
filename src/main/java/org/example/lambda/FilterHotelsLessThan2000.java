package org.example.lambda;

public class FilterHotelsLessThan2000 implements FilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight() <= 2000;
    }
}
