package com.kelaniya.v7.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

//    Constructor of the class ( Which means class name and method name both are same )
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {

        if (args.length == 0) {
            System.out.println("Please provide any operation as an arguments");
            return " ";    // will change in the future
        }

        String operator = args[0];

//        Open-close principle has violated here : Add new feature without changing the existing codes

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide add, sub, mul as the operator arguments..!");
            return " ";    // will change in the future
        }
        return operator;

    }

}
