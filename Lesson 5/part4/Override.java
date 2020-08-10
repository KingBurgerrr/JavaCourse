package relaceed;


public class Override {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public Override(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int Stat(int c) {
        this.c = a + b;
       return c;
    }
}
