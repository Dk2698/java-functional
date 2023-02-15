package org.example.functional.part2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public interface LabExampleSolution {
    static List<String> getNamesOfLength4(List<String> names) {
        return names.stream()
                .filter(name -> name.length() == 4)
                .collect(toList());
    }

    static List<String> getNamesOfLength5InUpperCase(List<String> names) {
        return names.stream()
                .filter(name -> name.length() == 5)
                .map(String::toUpperCase)
                .collect(toList());
    }

    static List<String> getInUpperCaseNamesOfLength4AndHavingL(List<String> names) {
        return names.stream()
                .filter(name -> name.length() == 4)
                .filter(name -> name.contains("l"))
                .map(String::toUpperCase)
                .collect(toList());
    }
}
