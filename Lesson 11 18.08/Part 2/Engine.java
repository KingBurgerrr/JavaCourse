package com.main.part2;

public class Engine extends Auto {
    private int cylinder;
    private String type;
    Engine(String auto, int year, int ls, String type, int cylinder) {
        super(auto, year, ls);
        this.cylinder = cylinder;
        this.type = type;
    }

    @Override
    public String toString() {
        return " Двигун {" +
                "Циліндрів: " + cylinder +
                ", Тип: '" + type + '\'' +
                '}';
    }
}
