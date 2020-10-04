package com.logos.lesson12;

import java.util.ArrayList;

public class Rudder{
    private int diam = 20;
    private String material = "Дерево";

    public ArrayList<String> Rudder = new ArrayList(); {
        Rudder.add(" Діметер керма : " + diam);
        Rudder.add(" Матеріал керма : " + material);
        System.out.println(Rudder.get(0) + Rudder.get(1));
    }
}
