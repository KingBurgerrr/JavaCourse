package Lesson7;

public class Main {
    public static void main(String[] args) {
        Pilot plt = new Pilot();
        plt.Pilot();
        Su27 su27 = new Su27();
        su27.stels(Danger.on);
        su27.bomb(Danger.b);
        //plt.getDown();
        //plt.getRight();
    }
}
