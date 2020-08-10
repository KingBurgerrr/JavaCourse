package main;

public class Body {
    private String ba;
    private String bb;

    Body(String ba, String bb) {
        this.ba = ba;
        this.bb = bb;
    }
    public String toString() {
        return ba + bb;
    }
}
