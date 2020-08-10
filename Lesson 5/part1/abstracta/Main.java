package abstracta;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Uplodet up = new Uplodet(12, 156);
        dog.voice();
        cat.voice();
        cow.voice();
        up.calculate();
        }
    }
