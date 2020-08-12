package Lesson7;

import java.util.Random;

public abstract class Plane {
   public void setStartEngine(String on) {
        for(double i = 20.88; i < 0.1; i--){
            System.out.println("Залишилось часу: "+ i);
        }
       Random fuel = new Random(1000);
       System.out.println("паливо: " + fuel);
    }
      public void fuel() {
        Random fuel = new Random(1000);
        System.out.println("паливо: " + fuel);
       }
    public static void GDown() {
       int lenght = 12;
       int wight = 5;
       int mass = 7;
    }
    void GDown(int lenght, int wight, int mass) {
        System.out.println("Ліиак йде на посадку! " + lenght + wight + mass + "тон");
    }
    abstract void setLenght(int lenght);
    abstract void setWight(int wight);
    abstract void setMass(int mass);

}
