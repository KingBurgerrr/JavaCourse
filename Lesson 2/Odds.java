package program;

import java.util.Scanner;

public class Odds {
    public static void main(String[] args) {
        System.out.println("Введіть значення");
        Scanner n1 = new Scanner(System.in);
        int n = n1.nextInt();
            if (n % 2 == 0) {
                System.out.println("Число: " + n + "-парне");
            } else {
                System.out.println("Число " + n + "-не парне");
            }
        }
    }
