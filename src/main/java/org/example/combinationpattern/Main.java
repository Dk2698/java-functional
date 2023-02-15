package org.example.combinationpattern;

import java.time.LocalDate;

import static org.example.combinationpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gail.com",
                "+919090909090",
                LocalDate.of(2015,1,1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));
        System.out.println("using combinator pattern");
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw  new IllegalStateException(result.name());
        }
    }
}
