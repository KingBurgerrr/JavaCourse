package com.lgs.lab.interface1.com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    private int a = 10;
    private int b = 5;

    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int myCalc() {
        return plus(10,5)
                + minus(10,5) +
                divide(10,5) +
                multiply(10,5);
    }
}
