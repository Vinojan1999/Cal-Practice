package com.kelaniya.v6;

import com.kelaniya.v6.input.CommandLineInputs;
import com.kelaniya.v6.input.Inputs;
import com.kelaniya.v6.operation.Operation;
import com.kelaniya.v6.operation.OperationFactory;
import com.kelaniya.v6.repository.FileNumberRepository;
import com.kelaniya.v6.repository.NumberRepository;
import com.kelaniya.v6.ui.UI;
import com.kelaniya.v6.ui.CmdLineUI;

import java.io.IOException;

//      here, Dependency Injection principle has violated
public class Main {

    public static void main(String[] args) throws IOException {


//        Created an interface & called here : for Loose-coupling
        Inputs inputs = new CommandLineInputs(args);            // Calling interface
        String operator = inputs.getOperator();


//        Created an interface and called here : for Loose-coupling
        NumberRepository numberRepository = new FileNumberRepository();
        Double[] numbers = numberRepository.getNumbers();


        OperationFactory operationFactory = new OperationFactory();             // Object created
        Operation operation = operationFactory.getInstance(operator);           // Call the method
        Double result = operation.execute(numbers);

        UI ui = new CmdLineUI();
        ui.showMessage("The calculation result is: "+result);

    }
}
