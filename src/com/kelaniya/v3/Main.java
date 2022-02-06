package com.kelaniya.v3;

import com.kelaniya.v3.operation.AddOperation;
import com.kelaniya.v3.operation.MulOperation;
import com.kelaniya.v3.operation.SubOperation;

import java.io.IOException;


public class Main {

//    Main class is the coordinator now..
    public static void main(String[] args) throws IOException {

//        Create CommandLineInput object - From constructor
        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();           // Assign the variable "operator"

//        Create FileReader object
        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        double result = 0;

//        Decision making + Coordinating  :  Responsibilities
        switch (operator) {
            case "add" -> {
                AddOperation addOperation = new AddOperation();
                result = addOperation.execute(numbers);
            }
            case "sub" -> {
                SubOperation subOperation = new SubOperation();
                result = subOperation.execute(numbers);
            }
            case "mul" -> {
                MulOperation mulOperation = new MulOperation();
                result = mulOperation.execute(numbers);
            }
        }

        System.out.println("The calculation result is: "+result);

    }
}
