import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        String in = input.read();
        System.out.println("Введыть натуральнечисло: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        for (int i = 0; i < in; i++){
            if (in % 2 == 0) {
                System.out.println("Введене число " + in + "є парним");
            } else {
                System.out.println("Ваше число не є парним!");
            }
            break;
        }
    }
}
