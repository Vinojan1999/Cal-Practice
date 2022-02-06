package com.kelaniya.v5;

import com.kelaniya.v5.operation.*;

import java.io.IOException;

//      here, Dependency Injection principle has violated
public class Main {

    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();           // Assign the variable "operator"

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

//        OperationFactory
        OperationFactory operationFactory = new OperationFactory();             // Object created
        Operation operation = operationFactory.getInstance(operator);           // Call the method
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The calculation result is: "+result);

    }
}
