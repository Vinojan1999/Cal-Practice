package com.kelaniya.v7.operation;

public class SubOperation implements Operation {

    public Double execute(Double[] numbers) {
        return numbers[0] - numbers[1];
    }

}
