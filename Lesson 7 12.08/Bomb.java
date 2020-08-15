package Lesson7;

import java.util.Random;

public interface Bomb {
    double bb = Math.random()*9.9;
    String b  = "Ядерна атака" + bb;
    String bomb(String b);
}
