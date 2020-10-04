package com.main.part2;


public class Auto {
    private int year;
    private int ls;
    private String auto;

    Auto(String auto, int year, int ls) {
        this.year = year;
        this.ls = ls;
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Авто {" +
                auto + ": " +
                "Рік випуску: " + year +
                ", Кіньскіх сил: " + ls +
                '}';
    }
}
