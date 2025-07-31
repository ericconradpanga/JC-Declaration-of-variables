package org.example;

public class Demo {
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    public void printInstanceVariables() {
        System.out.println("\nInstance Variables:");
        System.out.println("\tinstanceBinary: " + instanceBinary);
        System.out.println("\tinstanceOctal: " + instanceOctal);
        System.out.println("\tinstanceDouble: " + instanceDouble);
    }
}