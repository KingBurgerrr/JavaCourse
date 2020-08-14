package Lesson7;

import java.util.Random;

public interface Danger extends Forsage, Fuel, Bomb, Stels {
    Random b10 = new Random(10);
    Random ff = new Random(1000);
    String s = "Стелс включено!";
    String b = "Бомби скинуто " + b10;
    String fors = "Форсаж активовано!";
    String f = "Палива" +ff + "Лытрыв";
}
