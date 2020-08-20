public class Rectangle {
    private int high;
    private int wight;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    void Rectangle(int high, int wight) {
        this.high = high;
        this.wight = wight;
        System.out.println("Площа прямокутника " + (high * wight));
    }
}
