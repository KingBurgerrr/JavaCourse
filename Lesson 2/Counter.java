package program;

public class Counter {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 0; a <= 54; a++){
            System.out.println("Елемент Номер " + a + " = " + (a * 2 + 1));
        }
        for (b = 19; b >= 0; b--){
            System.out.println("Не від'ємні числа: " + (b * 5));
        }
        System.out.println("Всього елементів: " + a);
    }
}
