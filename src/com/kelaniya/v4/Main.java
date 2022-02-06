package com.kelaniya.v4;

import com.kelaniya.v4.operation.AddOperation;
import com.kelaniya.v4.operation.MulOperation;
import com.kelaniya.v4.operation.Operation;
import com.kelaniya.v4.operation.SubOperation;

import java.io.IOException;

//      Apply the "LISKOV SUBSTITUTION PRINCIPLE"
public class Main {

//    Main class is the coordinator now..
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();           // Assign the variable "operator"

        FileReader fileReader = new FileReader();               // Object created
        Double[] numbers = fileReader.getNumbers();             // Call the method


//        ## Decision making + Coordinating still happen ##
//        will remove this decision making part in next version

        Operation operation = null;             // Create an object "operation"  of interface class
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation = new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        }

        Double result = operation.execute(numbers);

        System.out.println("The calculation result is: "+result);

    }
}
