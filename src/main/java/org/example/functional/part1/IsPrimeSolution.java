package org.example.functional.part1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class IsPrimeSolution {
    public  static  boolean isPrime(int number){
        return  number > 1 && IntStream.range(2,number)
                .noneMatch(index -> number % index == 0);
    }

    public  static  long countWordsInFile(String filePath, String searchWord) throws IOException {
        return Files.lines(Path.of(filePath))
                .filter(line -> line.contains(searchWord))
                .count();
    }

    public static void main(String[] args) {

    }
}
