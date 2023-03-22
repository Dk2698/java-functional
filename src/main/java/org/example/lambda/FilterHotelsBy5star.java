package org.example.lambda;

public class FilterHotelsBy5star implements FilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelType() == HotelType.FIVE_STAR;
    }
}
