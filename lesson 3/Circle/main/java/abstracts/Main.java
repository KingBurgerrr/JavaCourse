package abstracts;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3,9);
        System.out.println("Поле кола: " + circle.area());
        System.out.println("Довжмна кола: " + circle.lenght());
    }
}
