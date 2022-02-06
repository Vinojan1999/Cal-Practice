package com.kelaniya.v7;

import com.kelaniya.v7.input.Inputs;
import com.kelaniya.v7.operation.Operation;
import com.kelaniya.v7.operation.OperationFactory;
import com.kelaniya.v7.repository.NumberRepository;
import com.kelaniya.v7.ui.UI;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {      // we will change in the future (IOException)

        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The calculation result is: "+result);

    }

}
