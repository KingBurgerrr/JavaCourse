package main;

public class Rudder {
    private String ra;
    private int rb;

    Rudder(String ra, int rb) {
        this.ra = ra;
        this.rb = rb;
    }
    public String toString() {
        return ra + rb;
    }
}
