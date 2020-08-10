package program;

public class second {
    public static void main(String[] args) {
        /*оголошуєио змінні*/
        int a;
        int b;
        int c;
        /*присвоюємо змінними числа*/
        a = 252;
        b = 105;
        /*якщо умова підходить для вирішення, вона виконає наступний кейс і виведе результат*/
        if (a > b & a != 0 & b != 0) {
            c = a % b;
            a = b;
            b = c;
            //c = a % b;
            System.out.println("Advision" + " " + c);
            /*якщо умова не виконується, результат буде негативним*/
        }else {
            c = b % a;
            b = a;
            a = c;
            c = b % a;
            System.out.println("Unknown number" + " " + c);
        }
    }
}
