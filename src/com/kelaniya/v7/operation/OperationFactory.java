package com.kelaniya.v7.operation;

public class OperationFactory {

    public Operation getInstance(String operator) {

        Operation operation = null;
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation = new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        } else if (operator.equals("div")) {
            operation = new DivOperation();
        }       // Open-close principle has violated -> This is a known violation

        return operation;

    }

}
