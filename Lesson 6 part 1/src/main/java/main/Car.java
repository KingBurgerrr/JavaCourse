package main;

public class Car {
    private String m;
    private String c;
    private String mt;
   // Wheel wh = new Wheel("Колесо ", 22);
   // Rudder ed = new Rudder("Кермо ", 17);
   // Body bd = new Body("Кузов ", "Форд-МК2");
    //  Car cr = new Car("Ford Focus", "red", "Metal");

    Car(String m, String c, String mt) {
        this.m = m;
        this.c = c;
        this.mt = mt;
    }
    public String toString() {
        return this.m + this.c + this.mt;
    }
}