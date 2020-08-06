package abstracta;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.voice();
        cat.voice();
        cow.voice();
        /*Завдання №2 Монетка*/
        Random rnd = new Random();
        int m = rnd.ints(0,2).limit(100).sum();
        System.out.println("Орел випав " + m + " раз із 100 раз, решка " + (100-m));
    }
}
