package org.example.functional.part1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IsPrime {
    public  static  boolean isPrime(int number){
        boolean divisible = false;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                divisible = true;
                break;
            }
        }
        return  number > 1 && !divisible;
    }

    public  static  long countWordsInFile(String filePath, String searchWord) throws IOException {
        long count = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;

        while ((line = bufferedReader.readLine())!= null){
            if(line.contains(searchWord)){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {

    }
}
