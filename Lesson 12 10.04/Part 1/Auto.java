package com.logos.lesson12;


import java.util.ArrayList;

public class Auto {
    private int year = 1990;
    private int ls = 460;
    private String auto = "Ford";

    public ArrayList<String> Auto = new ArrayList(); {
        Auto.add(" Авто : " + auto);
        Auto.add(" Рік : " + year);
        Auto.add(" Кіньских Сил : " + ls);
        System.out.println(Auto.get(0) + Auto.get(1) + Auto.get(2));
    }
}
