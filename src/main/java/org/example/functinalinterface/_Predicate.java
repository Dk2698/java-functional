package org.example.functinalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("+918000200202"));
        System.out.println(isPhoneNumberValid("+91800020020"));
        System.out.println(isPhoneNumberValid("+928000200202"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("+918000200202"));
        System.out.println(isPhoneNumberValidPredicate.test("+91800020020"));
        System.out.println(isPhoneNumberValidPredicate.test("+928000200202"));

        System.out.println(
                "Is Phone number valid and contains number 3 = " +
        isPhoneNumberValidPredicate.and(containsNumber3).test("+910098773000"));

        System.out.println(
                "Is Phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("+910098770000"));
    }
    static  boolean isPhoneNumberValid(String phoneNumber){
        return  phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+91") && phoneNumber.length() == 13;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
