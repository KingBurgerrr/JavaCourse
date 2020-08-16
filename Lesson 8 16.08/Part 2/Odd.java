import java.io.IOException;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) throws IOException {
        System.out.println("Ііедіть два числа, які додадуться: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (true ){
            try {
                System.out.println("Введіть перше значення: ");
                System.out.println("Введіть друге значення: ");
                System.out.println("Сума: " + (a + b));
            } catch (Exception e) {
                e.printStackTrace();
            }
            //System.out.println("Ви ввели не вірне число!");
        }
    }
}
