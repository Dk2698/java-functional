package org.example.functional.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabExample {
    static List<String> getNamesOfLength4(List<String> names) {
        List<String> namesOfLength4 = new ArrayList<>();

//        for(String name: names) {
//            if(name.length() == 4) {
//                namesOfLength4.add(name);
//            }
//        }
        names.stream()
                .filter(name -> name.length() == 4)
                .forEach(name -> namesOfLength4.add(name)); // pleas don't do this
        // the lambda passed to foreach is "not" a pure function
        // but , the code works (or does it)

        return namesOfLength4;
    }

    static List<String> getNamesOfLength5InUpperCase(List<String> names) {
        List<String> namesOfLength5InUpperCase = new ArrayList<>();

        for(String name: names) {
            if(name.length() == 5) {
                namesOfLength5InUpperCase.add(name.toUpperCase());
            }
        }
        return namesOfLength5InUpperCase;
    }

    static List<String> getInUpperCaseNamesOfLength4AndHavingL(List<String> names) {
        List<String> result = new ArrayList<>();

        for(String name: names) {
            if(name.length() == 4 && name.contains("l")) {
                result.add(name.toUpperCase());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jill", "George", "Raju", "Ahmed", "Chen", "Paul", "Priya");
    }
}
