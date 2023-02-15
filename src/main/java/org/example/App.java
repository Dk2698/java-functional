package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.example.App.Gender.FEMALE;
import static org.example.App.Gender.MALE;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<Person> people = List.of(
            new Person("John", MALE),
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Alish", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        System.out.println("// imperative approach");
        List<Person> females = new ArrayList<>();

        for ( Person person: people) {
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for ( Person female: females) {
            System.out.println(female);
        }
        System.out.println("// declarative approach");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
//                .filter(person -> FEMALE.equals(person.gender))
                .filter(personPredicate)
                .collect(Collectors.toList());
//                .forEach(System.out::println);
        females2.forEach(System.out::println);
    }

    static class Person{
        private  final  String name;
        private  final  Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum  Gender{
        MALE, FEMALE;
    }
}
