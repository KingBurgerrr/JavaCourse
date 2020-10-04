package com.logos.lesson12;

import java.util.ArrayList;

public class Engine {
    private int cylinder = 6;
    private String type = "v8";
    public ArrayList<String> Engine = new ArrayList(); {
        Engine.add(" Кількість цмліндрів : " + cylinder);
        Engine.add(" Тип двигуна : " + type);
        System.out.println(Engine.get(0) + Engine.get(1));
    }
}
