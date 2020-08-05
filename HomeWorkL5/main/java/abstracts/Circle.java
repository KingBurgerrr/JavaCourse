package abstracts;

public class Circle {
    private int rad;
    private int diam;
    double a = 3.14;
    double b = 2;

    public int getRad() {
        return rad;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getDiam() {
        return diam;
    }
    public void setDiam(int diam) {
        this.diam = diam;
    }
    public Circle(int rad, int diam) {
        this.rad = 3;
        this.diam = 9;
    }
    public double area() {
        return 3.14 * Math.pow(getDiam(), 2)/4;
    }
    public double lenght() {
        return (3.14 * 2) * getRad();
    }
}
