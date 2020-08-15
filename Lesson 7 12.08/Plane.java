package Lesson7;

import java.util.Random;

public abstract class Plane {
    int min = 20;
    int max = 88;
    int on = (int) ((Math.random()* max) + min);

    public void Plane() {
        System.out.println("Двигун включено: " + on + " ...");
    }
    int wight;
    int lenght;
    int mass;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getWight() {
        return wight;
    }

    public int getLenght() {
        return lenght;
    }

    public int getMass() {
        return mass;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public void gdown(int wight, int lenght, int mass) {
        System.out.println("Йдемо на посадку: " + " висота: " + wight + " Довжина: " + lenght + " Масса: " + mass);
    }

    protected abstract int on(int min, int max);

    public abstract void gdown();
}
