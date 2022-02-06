package com.kelaniya.v5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// This class name will be changed
public class FileReader {

    public Double[] getNumbers() throws IOException {  // will change the method signature too..

        //        Read the numbers from other txt file
        List<String> NumberStrn = Files.readAllLines(
                Paths.get("/home/vinojan/IdeaProjects/Calculator/numbers.txt")
        );

        double number1 = Double.parseDouble((NumberStrn.get(0)));
        double number2 = Double.parseDouble((NumberStrn.get(1)));

        return new Double[]{number1, number2};  // here, Double is the array name

    }

}
