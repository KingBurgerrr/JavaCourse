package pack;

public class Main {
    public static void main(String[] args) {
        Robot rb = new Robot();
        CoffeRobot cr =  new CoffeRobot();
        RobotDancer rd = new RobotDancer();
        RobotCooker rc = new RobotCooker();
        rb.work();
        cr.work();
        rd.work();
        rc.work();

    }
}
