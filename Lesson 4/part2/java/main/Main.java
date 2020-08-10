package main;

public class Main {
    public static void main(String[] args) {
        Wheel wh = new Wheel("Колесо: ", 22);
        Rudder ed = new Rudder("Кермо: ", 17);
        Body bd = new Body("Кузов: ", "Форд-МК2");
        Car cr = new Car("Ford Focus ", "red ", "Metal ");
        System.out.println(wh.toString() + "\n" + ed.toString() + "\n" + bd.toString() + "\n" + cr.toString());
    }
}
