package Lesson7;

public class Pilot {
    double up = Math.random() + 30;
    double down = Math.random() + 30;
    double left = Math.random() + 30;
    double right = Math.random() + 30;

    public void setUp() {
        this.up = up;
    }

    public void setDown() {
        this.down = down;
    }

    public void setLeft() {
        this.left = left;
    }

    public void setRight() {
        this.right = right;
    }

    public double getUp() {
        return up;
    }

    public double getDown() {
        return down;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public void Pilot() {
        System.out.println("В гору: " + up + "В низ: " + down + "В ліво: " + left + "В право: " + right);
    }
}
