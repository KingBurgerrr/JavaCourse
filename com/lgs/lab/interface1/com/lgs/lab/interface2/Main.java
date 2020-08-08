package com.lgs.lab.interface1.com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class Main {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();

        System.out.println("Додавання: " + mc.plus(10,5) + "\n" + "Віднімання: + " mc.minus(10,5) + "\n" +  "Діління: " + mc.divide(10,5) + "Множення: " + "\n" + mc.multiply(10, 5));
    }
}
