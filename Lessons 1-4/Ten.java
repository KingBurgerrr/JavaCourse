package program;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        System.out.println("Введіть перше значення: ");
        Scanner n1 = new Scanner(System.in);
        double n = n1.nextDouble();
        System.out.println("Введіть друге значення: ");
        Scanner m1 = new Scanner(System.in);
        double m = m1.nextDouble();
        int a;
        a = 10;
        double b = Math.abs(a - n);
        double c = Math.abs(a - m);
        if (b == c){
            System.out.println("Числа " + n +" и " + m  + " рівні " + a);
        }
        if(b>c){
            System.out.println("Число " + m + " ближче до " + a);
        }
        if (b<c) {
            System.out.println("Число " + n + " ближче до " + a);
        }
    }
}