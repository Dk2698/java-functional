package org.example.optionals;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Supplier<IllegalStateException> excepation = () -> new IllegalStateException("Excepation");
        Object value1 = Optional.ofNullable("hello")
                .orElseThrow(excepation);
        System.out.println(value1);

        Optional.ofNullable("email@gmail.com")
                .ifPresent(email -> System.out.println("sending email to "+ email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("sending email to "+ email),
                        () -> System.out.println("Cannot send email"));
    }
}
