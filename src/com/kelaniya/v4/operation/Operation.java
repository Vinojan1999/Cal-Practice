package com.kelaniya.v4.operation;


//      Abstract class or Interface class -> Interface
public interface Operation {

    Double execute(Double[] numbers);    // Method signature :
                                         // Method_Name-execute, Parameters-(Double[] numbers), Return_type-Double
}





////////////////////// NOTES /////////////////////////

// Abstract : Animal >>> Cat, Dog : Congrete class
// -> Sharable properties (age, food preference, etc..)
// -> Sharable methods / behavior

// Interface classes -> share only the method signature : execute(Double[] numbers)

// Put "implements <INTERFACE_CLASS_NAME> " in each an every child classes