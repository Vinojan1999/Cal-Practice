package com.kelaniya.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

//        Make sure to validate the arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide any operation as an arguments");
            return;
        }

//            another validation tha we could to do these args?
//            add, sub, mul
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add, sub, mul as the operator arguments..!");
            return;
        }

//        Read the numbers from other txt file
        List<String> NumberStrn = Files.readAllLines(
                Paths.get("/home/vinojan/IdeaProjects/Calculator/numbers.txt")
        );


//        Here, passing the value to variables
//        We can use double data type when we get decimal numbers
        int number1 = Integer.parseInt(NumberStrn.get(0));
        int number2 = Integer.parseInt(NumberStrn.get(1));

//        If-else method
//        int result = 0;
//        if (operator.equals("add")) {
//            result = number1 + number2;
//        } else if (operator.equals("sub")) {
//            result = number1 - number2;
//        } else if (operator.equals("mul")) {
//            result = number1 * number2;
//        }

//        Switch case method
        int result;
        switch (operator) {
            case "add":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
                break;
            case "mul":
                result = number1 * number2;
                break;
            default:
                System.out.println("Please put the correct operation..!");
                return;
//                case "add" -> result = number1 + number2;
//            case "sub" -> result = number1 - number2;
//            case "mul" -> result = number1 * number2;
//            default -> {
//                System.out.println("Please put the correct operation..!");
//                return;
        }


        System.out.println("The calculation result is:" + result);

    }
}
