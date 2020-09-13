package com.main.part2;

public class Rudder extends Auto {
    private int diam;
    private String material;
    Rudder(String auto, int year, int ls, String material, int diam) {
        super(auto, year, ls);
        this.diam = diam;
        this.material = material;
    }

    @Override
    public String toString() {
        return " Кермо {" +
                "Даметр: " + diam +
                ", Матеріал: '" + material + '\'' +
                '}';
    }
}
