package com.kelaniya.v7.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws IOException {

        //        Read the numbers from other txt file
        List<String> NumberStrn = Files.readAllLines(
                Paths.get("/home/vinojan/IdeaProjects/Calculator/numbers.txt")
        );

        double number1 = Double.parseDouble((NumberStrn.get(0)));
        double number2 = Double.parseDouble((NumberStrn.get(1)));

        return new Double[]{number1, number2};  // here, Double is the array name

    }

}
