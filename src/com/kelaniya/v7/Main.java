package com.kelaniya.v7;

import com.kelaniya.v7.input.CommandLineInputs;
import com.kelaniya.v7.input.Inputs;
import com.kelaniya.v7.operation.Operation;
import com.kelaniya.v7.operation.OperationFactory;
import com.kelaniya.v7.repository.FileNumberRepository;
import com.kelaniya.v7.repository.NumberRepository;
import com.kelaniya.v7.ui.CmdLineUI;
import com.kelaniya.v7.ui.UI;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp calculatorApp = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        calculatorApp.execute();

    }
}
