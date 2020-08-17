import java.io.IOException;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) throws IOException {
        System.out.println("Ііедіть два числа, які додадуться: ");
        Scanner scanner = new Scanner(System.in);
        try {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (;; ){
                System.out.println("Введіть перше значення: ");
                System.out.println("Введіть друге значення: ");
                System.out.println("Сума: " + (a + b));
                break;
        }
        } catch (Exception e) {
            System.out.println("Введене не правельне число");
        }
    }
}
